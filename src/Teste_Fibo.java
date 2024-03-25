import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Nested
public class Teste_Fibo {

    @Test
    void teste1(){
        Fibo objeto = new Fibo();

        int retorno1 = objeto.fiboInteretivo(1);
        int retorno2 = objeto.fiboRecursivo(1);
        assertEquals(2, retorno1, retorno2);
    }

    @Test
    void teste2(){
        Fibo objeto = new Fibo();

        int retorno1 = objeto.fiboInteretivo(2);
        int retorno2 = objeto.fiboRecursivo(2);
        assertEquals(3, retorno1, retorno2);
    }
}
