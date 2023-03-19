/**
 * 
 */
package ejercicio1;

import java.util.InputMismatchException;

import utils.Utils;

/**
 * @author Palmira
 *
 */
public class Ejercicio1 {

	/*
	 * 1. Escribe un programa, utilizando para ello el paradigma de POO, que juegue
	 * con el usuario a adivinar un número. Debe cumplir los siguientes
	 * requerimientos: 1.- El ordenador debe generar un número entre 1 y 500, y el
	 * usuario tiene que intentar adivinarlo. 2.- Cada vez que el usuario introduce
	 * un valor, el ordenador debe decirle al usuario si el número que tiene que
	 * adivinar es mayor o menor que el que ha introducido el usuario. 3.- Cuando
	 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
	 * veces que el usuario ha intentado adivinar el número. 4.- Si el usuario
	 * introduce algo que no es un número, debe indicarlo en pantalla, y contarlo
	 * como un intento indicando que no ha conseguido reconocer la entrada lanzando
	 * la excepción InputMismatchException.
	 */

	private int numPC;
	private int numUsuario;
	private int intentos;
	private boolean correcto = false;

	/**
	 * @param pswPC
	 * @param pswUsuario
	 * @param intentos
	 * @param correcto
	 */

	public Ejercicio1(int numPC, int numUsuario, int intentos, boolean correcto) {
		super();
		this.numPC = numPC;
		this.numUsuario = numUsuario;
		this.intentos = intentos;
		this.correcto = correcto;
	}

	/**
	 * 
	 */

	public void comprobarPsw() {
		numPC = Utils.generarRandom(1, 500);
		do {
			try {
				System.out.println("Introduce un número entre 1 y 500:");
				numUsuario = Utils.pedirEntero();
				if (numUsuario < numPC) {
					System.out.println("El número introducido es inferior al que debes adivinar");
					intentos++;
				} else if (numUsuario > numPC) {
					System.out.println("El número introducido es superior al que debes adivinar");
					intentos++;
				} else if (numUsuario == numPC) {
					System.out
							.println("Enhorabuena!!! Has acertado!!!" + "\nHas necesitado: " + intentos + " intentos.");
					correcto = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println(
						"El valor introducido no es correcto. Debe introducir obligatoriamente un número entero");
				intentos++;
			}

		} while (!correcto);

	}

	public Ejercicio1() {

	}

	public int getNumPC() {
		return numPC;
	}

	public void setNumPC(int numPC) {
		this.numPC = numPC;
	}

	public int getNumUsuario() {
		return numUsuario;
	}

	public void setNumUsuario(int numUsuario) {
		this.numUsuario = numUsuario;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

}
