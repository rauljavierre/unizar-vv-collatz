package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestLongitud {

    // Utilizo Object porque no funciona con otro tipo de dato... ¿Por qué?
    private Object esperado;
    private Object entrada;

    public SecuenciaCollatzTestLongitud(Object esperado, Object entrada){
        this.esperado = esperado;
        this.entrada = entrada;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        List<Object[]> parametros = new ArrayList<Object[]>();
        parametros.add(new Object[] {(long) 10, (long) 13});
        parametros.add(new Object[] {(long) 1, (long) 1});
        parametros.add(new Object[] {(long) -1, (long) 0});
        parametros.add(new Object[] {(long) -1, (long) -1});
        return parametros;
    }

    @Test
    public void secuencia_collatz_longitud() throws InterruptedException {
        if((long) entrada > 0){
            assertEquals(esperado, (long) new SecuenciaCollatz((Long) entrada).longitud());
        }
        else{
            long respuesta_erronea = secuencia_collatz_test((long) entrada);
            assertEquals(esperado, respuesta_erronea);
        }
    }

    public static long secuencia_collatz_test(long n) throws InterruptedException {
        Thread thread = new Thread(() -> new SecuenciaCollatz(n).longitud());
        thread.start();
        Thread.sleep(5000);
        // Puede significar que la secuencia la longitud de la secuencia es infinita...
        if(thread.isAlive()){
            thread.interrupt();
            return -1;
        }
        return 0;
    }
}
