/**
 * 
 */
package ejercicio4.main;

import ejercicio4.excepciones.ExcepcionOperaciones;
import ejercicio4.operaciones.OperacionesMatematicas;
import utils.Utils;

/**
 * @author Palmira
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean exit = false;

		do {
			System.out.println(
					"Opciones: \n0- Salir \n1- Suma Positivos \n2- Suma Negativos \n3- Multiplicación \n4- División \n5- Raiz Cuadrada");
			int opcion = Utils.pedirEntero();
			int num1, num2;
			switch (opcion) {
			case 0:
				exit = true;
				System.out.println("Programa terminado");
				
				break;
			case 1:
				System.out.println("Introduce el primer número: ");
				num1 = Utils.pedirEntero();
				System.out.println("Introduce el segundo número: ");
				num2 = Utils.pedirEntero();
				try {
					System.out.println(OperacionesMatematicas.sumaPositivos(num1, num2));
				} catch (ExcepcionOperaciones ex) {
					ex.numNegativo();
				}
				break;
			case 2:
				System.out.println("Introduce el primer número: ");
				num1 = Utils.pedirEntero();
				System.out.println("Introduce el segundo número: ");
				num2 = Utils.pedirEntero();
				try {
					System.out.println(OperacionesMatematicas.sumaNegativos(num1, num2));
				} catch (ExcepcionOperaciones ex) {
					ex.numPositivo();
				}
				break;
			case 3:
				System.out.println("Introduce el primer número: ");
				num1 = Utils.pedirEntero();
				System.out.println("Introduce el segundo número: ");
				num2 = Utils.pedirEntero();
				try {
					System.out.println(OperacionesMatematicas.multiplicacionPositivos(num1, num2));
				} catch (ExcepcionOperaciones ex) {
					ex.numNegativo();
				}
				break;
			case 4:
				System.out.println("Introduce el primer número: ");
				num1 = Utils.pedirEntero();
				System.out.println("Introduce el segundo número: ");
				num2 = Utils.pedirEntero();
				System.out.println(OperacionesMatematicas.dividir(num1, num2));
				break;
			case 5:
				System.out.println("Introduce un número: ");
				double num3 = Double.parseDouble(Utils.pedirString());
				System.out.println(OperacionesMatematicas.raiz(num3));
				break;
			default:
				System.out.println("Debes introducir un número del 0 - 5");
			}

		} while (!exit);
		
	}

}
