package ejercicio5;

import java.util.InputMismatchException;

import utils.Utils;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Utilizamos el control de errores para controlar que el digito entrado por
		// teclado sea un número entero.
		try {
			System.out.println("Introduce el tamaño de la nuestro array: ");
			int size = Utils.pedirEntero();
			Password[] passwords = new Password[size];
			System.out.println("Introduce la longitud de nuestra contraseña: ");
			int longitud = Utils.pedirEntero();
			boolean[] passFuerte = new boolean[size];

			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = new Password(longitud);
				passFuerte[i] = passwords[i].esFuerte();
				System.out.println(passwords[i].getContrasenya() + " " + passFuerte[i]);
			}
			// Si introduce un carácter no número y no entero, nos capturará el erorr de
			// tipo InputMismatchException
		} catch (InputMismatchException ex) {
			System.err.println("Error! Debes introducir un número entero.");

		} finally {
			System.out.println("Programa Terminado");
		}

	}

}
