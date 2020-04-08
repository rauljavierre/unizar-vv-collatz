package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestLongitud {

    private long esperado;
    private long entrada;

    public SecuenciaCollatzTestLongitud(long esperado, long entrada){
        this.esperado = esperado;
        this.entrada = entrada;
    }

    // El tipo base devuelto por el método estático etiquetado con @Parameters
    // tiene que ser siempre Object[]. El contenedor puede ser cualquier
    // clase o interfaz que implemente Iterable. Java realiza muchas conversiones
    // automáticas («boxing» y «unboxing) entre tipos primitivos y su clases
    // equivalentes y el «runner» Parameterized de JUnit también a la hora de
    // hacer «casting» de Objects a otras clases.
    @Parameters
    public static Iterable<Object[]> data() {
        List<Object[]> parametros = new ArrayList<Object[]>();
        parametros.add(new Object[] {10, 13});
        parametros.add(new Object[] { 1,  1});
        parametros.add(new Object[] {-1,  0});
        parametros.add(new Object[] {-1, -1});

        // Añado estos casos de prueba, aunque sean redundantes, puesto que
        // se pueden deducir de las transparencias, y podemos considerar a
        // estas como «test basis».
        parametros.add(new Object[] { 9, 40 });
        parametros.add(new Object[] { 8, 20 });
        parametros.add(new Object[] { 7, 10 });
        parametros.add(new Object[] { 6, 5 });
        parametros.add(new Object[] { 5, 16 });
        parametros.add(new Object[] { 4, 8 });
        parametros.add(new Object[] { 3, 4 });
        parametros.add(new Object[] { 2, 2 });

        return parametros;
    }

    @Test
    public void secuencia_collatz_longitud() throws InterruptedException {
        if(entrada > 0){
            assertEquals(esperado, new SecuenciaCollatz(entrada).longitud());
        }
        else{
            long respuesta_erronea = secuencia_collatz_test(entrada);
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
