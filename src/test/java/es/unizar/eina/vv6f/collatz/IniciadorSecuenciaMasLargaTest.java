package es.unizar.eina.vv6f.collatz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IniciadorSecuenciaMasLargaTest {

    // Utilizo Object porque no funciona con otro tipo de dato... ¿Por qué?
    private Object esperado;
    private Object entrada;

    public IniciadorSecuenciaMasLargaTest(Object esperado, Object entrada){
        this.esperado = esperado;
        this.entrada = entrada;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        List<Object[]> parametros = new ArrayList<Object[]>();
        parametros.add(new Object[] {(long) 837799, 1_000_000});
        parametros.add(new Object[] {(long) -1, 0});
        return parametros;
    }

    @Test
    public void secuencia_collatz_mas_larga(){
        assertEquals((long) esperado, Main.iniciadorSecuenciaMasLarga((int) entrada));
    }
}
