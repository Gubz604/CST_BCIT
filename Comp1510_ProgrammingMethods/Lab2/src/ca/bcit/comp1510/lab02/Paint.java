/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * This class utilizes the Scanner class to receive input from the user on the dimensions of a room to be painted and calculates the number of cans to paint the room.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 */
public class Paint {
	
	public static final int COVERAGE = 400;

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int length;
		int width;
		int height;
		int coats;
		
		System.out.println("Enter length in feet: ");
		length = scan.nextInt();
		System.out.println("Enter width in feet: ");
		width = scan.nextInt();
		System.out.println("Enter height in feet: ");
		height = scan.nextInt();
		System.out.println("Enter the number of coats: ");
		coats = scan.nextInt();
		
		int surfaceArea = 2 * length * height +
				2 * width * height +
				length * width;
		
		int coverageNeeded = surfaceArea * coats;
		
		double cansOfPaintNeeded = coverageNeeded / COVERAGE;
		
		System.out.println("\n\nYou need " + cansOfPaintNeeded + " cans of paint");
		scan.close();
		
	}

}
