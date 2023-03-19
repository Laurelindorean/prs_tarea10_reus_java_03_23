/**
 * 
 */
package ejercicio3;

import utils.Utils;

/**
 * @author Palmira
 *
 */
public class Ejercicio3 {

	/*
	 * 3. Escribe un programa, utilizando para ello el paradigma de POO, que genere
	 * un número aleatorio e indique si el número generado es par o impar. El
	 * programa utilizará para ello el lanzamiento de una excepción.
	 */

	// Recomendaciones:
	/*
	 * 1.- El programa utiliza la clase Random() para obtener un número aleatorio
	 * entre 0 y 999 (por poner un rango cualquiera.
	 */
	/*
	 * 2. Se determina si el número es par o impar y se lanza una excepción con el
	 * correspondiente mensaje para indicarlo (se limitará a mostrar el mensaje
	 * asociado a la excepción capturada).
	 */

	// ----------------- Variables -----------------
	int numRandom = 0;

	// Creamos un metodo para generar un número aleatorio
	public void generarExcepcion() {
		try {
			System.out.println("Vamos a generar un número aleatorio de 0-1000");
			//Generamos el numero entre 0 - 999 utilizando un metodo de la clase Utils
			numRandom = Utils.generarRandom(0, 1000);
			System.out.println("El número aleatorio generado es: " + numRandom);
			//Revisamos si es par o impar y devolvemos las excepciones 
			if (numRandom % 2 == 0) {
				throw new Exception("El número generado es par");
			} else {
				throw new Exception("El número generado es impar");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
