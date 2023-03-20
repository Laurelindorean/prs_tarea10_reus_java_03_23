/**
 * 
 */
package ejercicio5;

import utils.Utils;

/**
 * @author Palmira
 *
 */
public class Password {

	// --------------- CONSTANTES -----------------
	private static final int LONGITUD_DEF = 8;
	// --------------- VARIABLES ------------------
	private int longitud;
	private String contrasenya;

	/**
	 * 
	 */
	// -------------- CONSTRUCTORES --------------
	// Constructor por defecto
	public Password() {
		this.longitud = LONGITUD_DEF;
	}

	// Constructor que recibe el tamaño de la contraseña
	public Password(int longitud) {
		//Controlamos que la longitud no sea inferior a la longitud por defecto
		if (longitud < LONGITUD_DEF) {
			this.longitud = LONGITUD_DEF;
		} else {
			this.longitud = longitud;
		}
		this.contrasenya = generarPassword();
	}

	// Metodo para controlar si la contraseña es fuerte
	public boolean esFuerte() {
		int numeros = 0;
		int minusculas = 0;
		int mayusculas = 0;

		for (int i = 0; i < contrasenya.length(); i++) {
			if (contrasenya.charAt(i) <= 122 && contrasenya.charAt(i) >= 97) {
				minusculas++;
			} else if (contrasenya.charAt(i) <= 90 && contrasenya.charAt(i) >= 65) {
				mayusculas++;
			} else {
				numeros++;
			}
		}
		// Para ser considerada fuerte debe tener como mínimo 2 mayúsculas, 1 minúscula
		// y 5 números.
		if (mayusculas >= 2 && minusculas >= 1 && numeros >= 5) {

			return true;
		} else {

			return false;
		}

	}

	public String generarPassword() {
		String psw = "";
		for (int i = 0; i < longitud; i++) {
			// Escogemos aleatoriamente si el dato que nos devolverá sera un número, una
			// minúscula o una mayúscula
			int opcion = Utils.generarRandom(1, 4);
			// Si nos devuelve un 1 utilizaremos la tabla ASCII para que nos devuelva una
			// minuscula
			if (opcion == 1) {
				char minuscula = (char) Utils.generarRandom(97, 123);
				psw += minuscula;
				/*
				 * Si nos devuelve un 2 utilizaremos la tabla ASCII para que nos devuelva una
				 * mayuscula
				 */
			} else if (opcion == 2) {
				char mayuscula = (char) Utils.generarRandom(65, 91);
				psw += mayuscula;
				/*
				 * Si nos devuelve un 3 utilizaremos la tabla ASCII para que nos devuelva un
				 * numero.
				 */
			} else {
				char numeros = (char) Utils.generarRandom(48, 58);
				psw += numeros;
			}
		}
		return psw;
	}

	// --------------- GETTERS Y SETTERS --------------
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenya() {
		return contrasenya;
	}

}
