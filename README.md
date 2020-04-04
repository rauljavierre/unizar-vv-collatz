## Verificación y Validación
# Escritura de test parametrizados para el problema de las secuencias de Collatz

Plantilla de proyecto de IntelliJ para resolver el 
[problema 14 de Project Euler](https://projecteuler.net/problem=14). 


### Secuencias de Collatz

Se define la siguiente secuencia iterativa sobre el domino de los enteros positivos:

 - _n_ → _n_/2 (si _n_ es par)
 - _n_ → 3_n_ + 1 (si _n_ es impar)
    
Utilizando dicha definición y empezando en 13, se genera la siguiente secuencia:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1.

Puede comprobarse que esta secuencia (que comienza en 13 y termina en 1), contiene
 10 términos. Pese a que no ha sido probado aún (Conjetura de Collatz), se cree
 que las secuencias generadas empezando en cualquier número terminan en 1.

¿Qué número inicial, por debajo de un millón, genera la secuencia más larga?

**Nota**: Una vez la secuencia ha comenzado, es posible que algunos términos
superen el límite de un millón.

### Tareas

 1. Descargad el proyecto «ProblemaCollatz» de Moodle[].
    - O clonadlo de GitHub.
 2. Observad las clases `SecuenciaCollatz`,`Main` y sus métodos.
 3. Clase `SecuenciasCollatzTestSiguiente`
    - Diseñad pruebas basadas en la especificación para el método 
      `siguienteCollatz` aplicando particiones de equivalencia.
    - Por cada prueba diseñada:
        - Escribid un test en JUnit.
        - Ejecutad el test para comprobar que falla.
        - Añadid el código necesario para que el test pase.
        - Comprobad que la cobertura del método `siguienteCollatz` en modo 
          _tracing_ es del 100%.
    - Convertid las pruebas diseñadas en un test JUnit parametrizado.
    - Usad el ejemplo anterior para obtener casos de prueba adicionales, aunque
      sean redundantes.  
 
 4. Clase `SecuenciasCollatzTestLongitud`
    - Diseñad pruebas basadas en la especificación para el método 
      `longitudCollatz` aplicando particiones de equivalencia.
    - Por cada prueba diseñada, escribid un test, comprobad que falla, añadid 
      código para que pase y comprobad la cobertura.
    - Convertidlo en un test parametrizado.
        - Usad el ejemplo anterior para obtener casos adicionales de prueba.
 
 5. Clase `IniciadorSecuenciaMasLargaTest`
    - Diseño de pruebas basadas en la especificación.
    - Proponed los casos de prueba.
 
 7. Clase `SecuenciasCollatzTestSuite`
    - Suite JUnit que incluya las otras clases de tests.           
 
 6. Resto de métodos
    - Añadid pruebas hasta alcanzar una cobertura del 100% en modo tracing.