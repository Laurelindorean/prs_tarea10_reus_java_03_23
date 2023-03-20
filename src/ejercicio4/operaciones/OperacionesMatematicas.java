/**
 * 
 */
package ejercicio4.operaciones;

import ejercicio4.excepciones.ExcepcionOperaciones;

/**
 * @author Palmira
 *
 */
public class OperacionesMatematicas {

	// Metodo para calcular la suma de 2 números enteros
	public static int sumaEnteros(int num1, int num2) {
		return num1 + num2;
	}

	// Generamos un metodo para utilizar la excepcion creada especificamente
	public static int sumaPositivos(int num1, int num2) throws ExcepcionOperaciones {
		if (num1 < 0 || num2 < 0) {
			throw new ExcepcionOperaciones(num1, num2);
		}
		return num1 + num2;
	}

	// Generamos un metodo para utilizar la excepcion creada especificamente
	public static int sumaNegativos(int num1, int num2) throws ExcepcionOperaciones {
		if (num1 > 0 || num2 > 0) {
			throw new ExcepcionOperaciones(num1, num2);
		}
		return num1 - num2;
	}

	public static int multiplicacionPositivos(int num1, int num2) throws ExcepcionOperaciones {
		if (num1 < 0 || num2 < 0) {
			throw new ExcepcionOperaciones(num1, num2);
		}
		return num1 * num2;
	}

	public static double dividir(int dividendo, int divisor) {
		int division = 0;
		try {
			division = dividendo / divisor;
			// Utilizamos la excepcion ArithmeticException para controlar este error
		} catch (ArithmeticException ex) {
			ex.getMessage();
			ex.printStackTrace();
		}
		return division;
	}

	public static double raiz(double num1) {
		double resultado = 0;
		try {
			resultado = Math.sqrt(num1);
			//Utilizamos el metodo isNaN para lanzar el error. 
			if (Double.isNaN(resultado)) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException ex) {
			ex.getCause();
			ex.printStackTrace();
		}
		return resultado;
	}
}
