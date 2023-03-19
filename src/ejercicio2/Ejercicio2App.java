package ejercicio2;

import excepcion.MiExcepcion;

public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vamos a mostrar un ejemplo de mi Excepción");
		try {
			if(true) {
				throw new MiExcepcion();	
			}
		}catch(MiExcepcion ex) {
			System.out.println("Excepción capturada con mensaje: " + ex.mensaje());
		}finally {
			System.out.println("Ejecución terminada");
		}

	}

}
