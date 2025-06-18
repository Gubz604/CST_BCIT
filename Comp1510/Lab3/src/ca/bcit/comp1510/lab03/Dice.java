/**
 * 
 */
package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * This class highlights the use of generating random integers using the Random class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Dice {

	/**
	 * Drives the program. 
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		
		int fourSided;
		int sixSided;
		int eightSided;
		int tenSided;
		int twelveSided;
		int twentySided;
		
		fourSided = rand.nextInt(3) + 1;
		sixSided = rand.nextInt(5) + 1;
		eightSided = rand.nextInt(7) + 1;
		tenSided = rand.nextInt(9) + 1;
		twelveSided = rand.nextInt(11) + 1;
		twentySided = rand.nextInt(19) + 1;
		
		System.out.println("4-sided die: " + fourSided);
		System.out.println("6-sided die: " + sixSided);
		System.out.println("8-sided die: " + eightSided);
		System.out.println("10-sided die: " + tenSided);
		System.out.println("12-sided die: " + twelveSided);
		System.out.println("20-sided die: " + twentySided);
		System.out.println("The total value: " + 
		(fourSided + sixSided + eightSided + tenSided + twelveSided + twentySided));

	}

}
