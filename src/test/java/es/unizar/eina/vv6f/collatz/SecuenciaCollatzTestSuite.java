package es.unizar.eina.vv6f.collatz;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    SecuenciaCollatzTestSiguiente.class,
    SecuenciaCollatzTestLongitud.class,
    IniciadorSecuenciaMasLargaTest.class
})
public class SecuenciaCollatzTestSuite { }
