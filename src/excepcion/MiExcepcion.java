/**
 * 
 */
package excepcion;

/**
 * @author Palmira
 *
 */
//La clase debe heredar de Exception
public class MiExcepcion extends Exception{

	//Clase creada especialmente para capturar excepciones. 
	
	public String mensaje() {
		return "Esto es un objeto Exception";
	}
}
