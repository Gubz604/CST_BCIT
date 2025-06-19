/**
 * 
 */
package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * This class highlights the use of the Integer Wrapper class and some of its useful functions.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class IntegerWrapper {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value;
		
		System.out.println("Enter an integer: ");
		value = scan.nextInt();
		System.out.println("Binary: " + Integer.toBinaryString(value));
		System.out.println("Octal: " + Integer.toOctalString(value));
		System.out.println("Hexadecimal: " + Integer.toHexString(value));
		
		System.out.println("Max possible Java integer value is: " + Integer.MAX_VALUE);
		System.out.println("Min possible Java integer value is: " + Integer.MIN_VALUE);
		
		String intVal1;
		String intVal2;
		
		System.out.println("Enter two integer values: ");
		intVal1 = scan.next();
		intVal2 = scan.next();
		
		int sum = Integer.parseInt(intVal1) + Integer.parseInt(intVal2);
		System.out.println("The sum of the values is: " + sum);
		
		
		scan.close();
	}

}
