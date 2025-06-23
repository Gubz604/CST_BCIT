/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * This class creates a simple 2D matrix with methods that return the number of rows and columns, retreives the value
 * stored within any cell in the matrix, and sets the score in any cell in the matrix.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Matrix {
	
	private int[][] matrix;
	
	public Matrix(int rows, int cols) {
		this.matrix = new int[rows][cols];
	}
	
	public int getRows() {
		return matrix.length;
	}
	
	public int getColumns() {
		return matrix[0].length;
	}
	
	public int getValue(int row, int col) {
		return matrix[row][col];
	}
	
	public void setValue(int value, int row, int col) {
		matrix[row][col] = value;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				builder.append("| " + j + " ");
			}
			builder.append("|\n");
		}
		return builder.toString();
	}

}
