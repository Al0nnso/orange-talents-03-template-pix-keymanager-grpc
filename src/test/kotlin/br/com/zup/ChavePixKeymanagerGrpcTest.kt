package br.com.zup
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.FileInputStream
import java.io.FileOutputStream
import javax.inject.Inject

@MicronautTest
class ChavePixKeymanagerGrpcTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Test
    fun testCadastroPix() {
        val valor = "alonnsoandres@gmail.com"
        val request = CadastroRequest.newBuilder()
            .setTipo(Key.EMAIL)
            .setValor(valor)
            .setConta(Conta.POUPANCA).build()

        request.writeTo(FileOutputStream("pix-request.bin"))
        val request2 = CadastroRequest.newBuilder().mergeFrom(FileInputStream("pix-request.bin"))

        Assertions.assertEquals(valor,request2.valor)
    }

}
