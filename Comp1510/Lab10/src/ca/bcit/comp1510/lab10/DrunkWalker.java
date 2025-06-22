/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * This program tests the Random Walker by simulating a drunk walking on a square board in the middle
 * of a lake and seeing if the drunk loser falls off and counting how many drunks fall off the plank.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class DrunkWalker {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the max steps and boundary");
		int maxSteps = scan.nextInt();
		int boundary = scan.nextInt();
		
		System.out.println("How many drunks are there?");
		int numDrunks = scan.nextInt();
		
		
		RandomWalker rw;
		int numFalls = 0;
		for (int i = 0; i < numDrunks; i++) {
			
			System.out.println("Walk Number " + (i + 1));
			rw = new RandomWalker(maxSteps, boundary);
			rw.walk();
			if (!rw.inBounds()) {
				numFalls++;
			}
			System.out.println();
			
			if (i == numDrunks - 1) {
				System.out.println("The number of falls was " + numFalls);
			}
			
		}
		
		scan.close();
		
	}

}
