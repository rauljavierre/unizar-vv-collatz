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

    private long esperado;
    private long entrada;

    public SecuenciaCollatzTestSiguiente(long esperado, long entrada){
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
    public static Iterable<Object[]> data(){
        List<Object[]> parametros = new ArrayList<>();
        parametros.add(new Object[] {5, 10});
        parametros.add(new Object[] {16, 5});
        parametros.add(new Object[] {1,  1});

        // Añado estos casos de prueba, aunque sean redundantes, puesto que
        // se pueden deducir de las transparencias, y podemos considerar a
        // estas como «test basis».
        parametros.add(new Object[] { 40, 13 });
        parametros.add(new Object[] { 20, 40 });
        parametros.add(new Object[] { 10, 20 });
        parametros.add(new Object[] { 8, 16 });
        parametros.add(new Object[] { 4, 8 });
        parametros.add(new Object[] { 2, 4 });
        return parametros;
    }

    @Test
    public void secuencia_collatz_siguiente_entero(){
        assertEquals(esperado, SecuenciaCollatz.siguienteCollatz(entrada));
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