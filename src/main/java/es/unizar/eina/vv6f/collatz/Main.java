package es.unizar.eina.vv6f.collatz;

/**
 * <h1>
 *     <a href="http://projecteuler.net/problem=14">Project Euler Problem 14</a>
 * </h1>
 *
 * <p>
 *      The following iterative sequence is defined for the set of positive
 *      integers:
 * </p>
 * <p>
 *      n → n/2 (n is even) <br>
 *      n → 3n + 1 (n is odd)
 * </p>
 * <p>
 *      Using the rule above and starting with 13, we generate the following
 *      sequence:
 * </p>
 * <p>
 *      13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * </p>
 * <p>
 *      It can be seen that this sequence (starting at 13 and finishing at 1)
 *      contains 10 terms. Although it has not been proved yet (Collatz Problem),
 *      it is thought that all starting numbers finish at 1.
 * </p>
 * <p>
 *      Which starting number, under one million, produces the longest chain?
 * </p>
 * <p>
 *      NOTE: Once the chain starts the terms are allowed to go above one
 *      million.
 * </p>
 */
public class Main {
    /**
     * Valor máximo a considerar para un número iniciador de la secuencia de
     * Collatz.
     */
    private static final int LIMITE = 1_000_000;

    /**
     * Devuelve el valor del número positivo menor estricto que «limite» que
     * tiene asociada la secuencia de Collatz más larga.
     *
     * @param limite
     *            el número positivo siguiente al valor más alto que desea
     *            utilizarse para iniciar la secuencia de Collatz.
     * @return el valor del número positivo menor estricto que «limite» que
     *         tiene asociada la secuencia de Collatz más larga.
     */
    public static long iniciadorSecuenciaMasLarga(int limite) {
        int indice_mayor_longitud = -1;
        int mayor_longitud = -1;

        int i = 1;
        while ( i < limite){
            int longitud_secuencia = new SecuenciaCollatz(i).longitud();
            if(longitud_secuencia > mayor_longitud){
                mayor_longitud = longitud_secuencia;
                indice_mayor_longitud = i;
            }
            i++;
        }
        return indice_mayor_longitud;
    }

    /**
     * Escribe en la pantalla el valor del número entero positivo menor
     * estricto que 1_000_000 que tiene asociada la secuencia de Collatz más
     * larga.
     */
    public static void main(String[] args) {
        System.out.println(iniciadorSecuenciaMasLarga(LIMITE));
    }
}
