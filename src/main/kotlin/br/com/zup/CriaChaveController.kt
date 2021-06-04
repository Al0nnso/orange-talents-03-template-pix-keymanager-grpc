package br.com.zup

import io.grpc.Status
import io.grpc.stub.StreamObserver
import org.hibernate.validator.internal.util.Contracts.assertTrue
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class PixServer(@Inject private val repository: PixRepository) : PixServiceGrpc.PixServiceImplBase() {

    @Transactional
    override fun cadastrar(request: CadastroRequest?, responseObserver: StreamObserver<CadastroResponse>?) {
        try {
            val tipo = request?.tipo
            val conta = request?.conta
            var valor = request?.valor

            // O valor vai ser enviado pelo cliente?
            /*if(tipo==Key.KEY){
                valor=UUID.randomUUID().toString()
            }*/

            val chavePix = ChavePix(tipo, valor, conta, UUID.randomUUID())

            repository.save(chavePix)

            println(chavePix.id.toString())

            val response = CadastroResponse.newBuilder().setId(chavePix.id.toString()).build()
            responseObserver?.onNext(response)
            responseObserver?.onCompleted()

        } catch (e: ErrorMessage){
            val erro = when (e) {
                is ErrorMessage -> e.statusGrpc
                    .withDescription(e.message)
                    .asRuntimeException()
                else -> Status.UNKNOWN
                    .withDescription(e.message)
                    .asRuntimeException()
            }
            responseObserver?.onError(erro)
            responseObserver?.onCompleted()
        }
    }

}