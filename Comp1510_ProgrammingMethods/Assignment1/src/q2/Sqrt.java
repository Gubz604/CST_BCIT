/**
 * 
 */
package q2;

import java.util.Scanner;

/**
 * 
 */
public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		double value = scan.nextDouble();	
		
		double sqrt = (value + 1) / 2;
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				System.out.println("Estimate 1: " + sqrt);
			} else {
				sqrt = (sqrt + value / sqrt) / 2;
				System.out.println("Estimate " + (i + 1) + ": " + sqrt);
			}
		}

	}
}
