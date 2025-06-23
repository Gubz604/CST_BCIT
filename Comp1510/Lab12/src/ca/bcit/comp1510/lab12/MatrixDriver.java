/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * This class tests the Matrix class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class MatrixDriver {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Matrix matrix = new Matrix(2, 3);
		
		
		for (int i = 0; i  < 2; i++) {
			for (int j = 0; j < 3; j++) {
				matrix.setValue(j, i, j);
			}
		}
		
		System.out.println(matrix);
	}

}
