/**
 * 
 */
package utils;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Palmira
 *
 */
public class Utils {
	// Clase creada para implementar funciones reutilizables.
	static 
	Scanner sc = new Scanner(System.in);

	public static int generarRandom(int min, int max) {
		Random random = new Random();
		int numRandom = random.nextInt(max - min) + min;
		return numRandom;
	}

	public static String pedirString() {
		String palabra = sc.nextLine();
		return palabra;
	}

	public static int pedirEntero() {
		int numero = sc.nextInt();
		return numero;
	}

	public static double pedirReal() {
		double numero = sc.nextDouble();
		return numero;
	}

}
