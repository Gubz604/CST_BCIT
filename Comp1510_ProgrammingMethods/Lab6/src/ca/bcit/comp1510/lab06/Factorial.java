/**
 * 
 */
package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * The class computes the factorial of any valid non-negative integer.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Factorial {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = -1;

		while (n < 0) {
			System.out.println("Enter a non-negative integer:");
			try {
				n = scan.nextInt();
				if (n < 0) {
					System.out.println("You entered a negative integer. You must enter a non-negative integer.");
				}
			} catch (Exception e) {
				System.out.println("You didn't even enter a number! Try agian!");
				scan.nextLine();
			}

		}
		int product = 1;

		while (n > 1) {
			product = product * n;
			n -= 1;
		}

		System.out.println("The result is: " + product);

		scan.close();
	}

}
