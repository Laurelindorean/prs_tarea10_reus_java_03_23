/**
 * 
 */
package ejercicio4.excepciones;

/**
 * @author Palmira
 *
 */
public class ExcepcionOperaciones extends Exception {

	// --------------- Variables ------------
	protected int num1;
	protected int num2;

	/**
	 * @param num1
	 * @param num2
	 */
	// -------------- Constructores ---------
	public ExcepcionOperaciones(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void numPositivo() {
		if (this.num1 > 0) {
			System.out.println("El número " + this.num1 + " es positivo");
		}
		if (this.num2 > 0) {
			System.out.println("El número " + this.num2 + " es positivo");
		}
	}

	public void numNegativo() {
		if (this.num1 < 0) {
			System.out.println("El número " + this.num1 + " es negativo");
		}
		if (this.num2 < 0) {
			System.out.println("El número " + this.num2 + " es negativo");
		}
	}

}
