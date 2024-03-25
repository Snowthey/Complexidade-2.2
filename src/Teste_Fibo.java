import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Nested
public class Teste_Fibo {

    @Test
    void teste1(){
        Fibo objeto = new Fibo();

        int retorno1 = objeto.fiboIterativo(1);
        int retorno2 = objeto.fiboRecursivo(1);
        assertEquals(retorno1, retorno2);
    }

    @Test
    void teste2(){
        Fibo objeto = new Fibo();

        int retorno1 = objeto.fiboIterativo(0);
        int retorno2 = objeto.fiboRecursivo(0);
        assertEquals(retorno1, retorno2);
    }

    @Test
    void teste3(){
        Fibo objeto = new Fibo();

        int retorno1 = objeto.fiboIterativo(2);
        int retorno2 = objeto.fiboRecursivo(2);
        assertEquals(retorno1, retorno2);
    }
}
