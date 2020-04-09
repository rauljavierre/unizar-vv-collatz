package es.unizar.eina.vv6f.collatz;

/*
 * Clase para representar una secuencia de Collatz a partir del entero positivo
 * que la inicia.
 */
public class SecuenciaCollatz {

	private long n;

	/**
	 * Devuelve el término que sigue a «n» en una secuencia de Collatz.
	 *
	 * @param n
	 *            el valor positivo del que se quiere determinar su sucesor.
	 * @return el término que sigue a «n» en una secuencia de Collatz.
	 */
	public static long siguienteCollatz(long n) {
		if(n == 1){
			return 1;
		}
		if(n % 2 == 0){
			return n / 2;
		}
		else{
			return 3 * n + 1;
		}
	}

	/*
	 * @param inicio
	 *            el valor inicio, positivo, del que se quiere determinar
	 *            la longitud de su secuencia de Collatz.
	 */
	public SecuenciaCollatz(long inicio) {
		this.n = inicio;
	}

	/**
	 * Calcula y devuelve la longitud de la secuencia de Collatz asociada a este
	 * objeto.
	 *
	 * @return la longitud de la secuencia de Collatz asociada a este objeto.
	 */
	public int longitud() {
		int longSec = 1;
		while(n != 1){
			n = siguienteCollatz(n);
			longSec++;
		}
		return longSec;
	}
}