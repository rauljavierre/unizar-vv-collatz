package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IniciadorSecuenciaMasLargaTest {

    private long esperado;
    private long entrada;

    public IniciadorSecuenciaMasLargaTest(long esperado, long entrada){
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
        List<Object[]> parametros = new ArrayList<>();
        parametros.add(new Object[] { 837799, 1_000_000});
        // De cara al desarrollo, se podrían haber incluido otros casos de prueba
        // con números más pequeños, que habría que haber derivado de alguna
        // forma distinta al programa. En la clase del día 16 lo comentaré.
        parametros.add(new Object[] { -1, 0});
        return parametros;
    }

    @Test
    public void secuencia_collatz_mas_larga(){
        assertEquals(esperado, Main.iniciadorSecuenciaMasLarga((int) entrada));
    }
}