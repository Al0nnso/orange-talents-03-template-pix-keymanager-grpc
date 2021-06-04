package br.com.zup

import br.com.zup.ErrorMessage
import io.grpc.Status
import io.micronaut.http.HttpStatus
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
class ChavePix(
    @Enumerated(EnumType.STRING) @Column(nullable = false) val tipo: Key?,
    @Column(nullable = false) var chave: String?,
    @Enumerated(EnumType.STRING) @Column(nullable = false) val conta: Conta?,
    @Column(nullable = false) val idCliente: UUID?,
    ){

    @Id @GeneratedValue
    val id: UUID? = null

    @CreationTimestamp
    var criadoEm = LocalDateTime.now()

    init {
        val message = "A chave é invalida"
        when(this.tipo){
            Key.CPF -> {
                if(!Regex("^[0-9]{11}$").matches(this.chave.toString())){
                    throw ErrorMessage(message, HttpStatus.BAD_REQUEST, Status.FAILED_PRECONDITION)
                }
            }
            Key.TELEFONE -> {
                if(!Regex("^\\+[1-9][0-9]\\d{1,14}$").matches(this.chave.toString())){
                    throw ErrorMessage(message, HttpStatus.BAD_REQUEST, Status.FAILED_PRECONDITION)
                }
            }
        }
    }

}
