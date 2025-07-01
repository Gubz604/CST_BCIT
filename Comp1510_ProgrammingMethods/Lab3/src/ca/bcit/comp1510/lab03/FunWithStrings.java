/**
 * 
 */
package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * This class highlights various different methods in the String class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class FunWithStrings {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		System.out.println("Enter the title of your favourite book:");
		input = scanner.nextLine();
		System.out.println(input + " " + input.length() + " characters (including white space)");
		
		System.out.println("Does the title of the book start with the word \"The\"?"
				+ "\n " + input.startsWith("The"));
		
		System.out.println(input.toUpperCase());
		System.out.println(input.toLowerCase());
		System.out.println();
		
		String fullyTrimmed = input.trim();
		String capitalFirst = fullyTrimmed.substring(0, 1).toUpperCase();
		String capitalLast = fullyTrimmed.substring(fullyTrimmed.length() - 1, fullyTrimmed.length()).toUpperCase();
		String lowerMiddle = fullyTrimmed.substring(1, fullyTrimmed.length() - 1).toLowerCase();
		
		System.out.println(capitalFirst + lowerMiddle + capitalLast);
		scanner.close();

	}

}
