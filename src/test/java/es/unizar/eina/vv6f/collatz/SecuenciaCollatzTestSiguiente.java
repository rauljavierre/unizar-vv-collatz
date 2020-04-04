package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SecuenciaCollatzTestSiguiente {

    // Utilizo Object porque el código con long de más abajo no funciona... ¿Por qué?
    private Object esperado;
    private Object entrada;

    public SecuenciaCollatzTestSiguiente(Object esperado, Object entrada){
        this.esperado = esperado;
        this.entrada = entrada;
    }

    @Parameters
    public static Iterable<Object[]> data(){
        List<Object[]> parametros = new ArrayList<Object[]>();
        parametros.add(new Object[] {(long) 5, (long) 10});
        parametros.add(new Object[] {(long) 16, (long) 5});
        parametros.add(new Object[] {(long) 1, (long) 1});
        return parametros;
    }

    @Test
    public void secuencia_collatz_siguiente_entero(){
        assertEquals(esperado, SecuenciaCollatz.siguienteCollatz((Long) entrada));
    }

    /*
    private long esperado;
    private long entrada;

    public SecuenciaCollatzTestSiguiente(long esperado, long entrada){
        this.esperado = esperado;
        this.entrada = entrada;
    }

    @Parameters
    public static Iterable<long[]> data(){
        List<long[]> parametros = new ArrayList<long[]>();
        parametros.add(new long[] {5, 10});
        parametros.add(new long[] {16, 5});
        parametros.add(new long[] {1, 1});
        return parametros;
    }

    @Test
    public void secuencia_collatz_siguiente_entero(){
        assertEquals(esperado, SecuenciaCollatz.siguienteCollatz((long) entrada));
    }
     */

    /*
    Los siguientes casos de prueba directamente no deja compilarlos

    Este porque long es un tipo primitivo y no deja asignarle null
    public void secuencia_collatz_siguiente_null(){
        SecuenciaCollatz.siguienteCollatz(null);
    }

    // Este porque String no hace match con long
    public void secuencia_collatz_siguiente_string(){
        SecuenciaCollatz.siguienteCollatz("hola");
    }

    // Clases primitivas distintas: double y long
    public void secuencia_collatz_siguiente_double(){
        SecuenciaCollatz.siguienteCollatz(3.14);
    }

    // Esto es lo más parecido que he conseguido obtener a pasarle null...
    // Tira una NumberFormatException
    @Test(expected = NumberFormatException.class)
    public void secuencia_collatz_siguiente_null(){
        SecuenciaCollatz.siguienteCollatz(Long.parseLong(null));
    }
     */
}
