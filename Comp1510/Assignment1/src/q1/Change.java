/**
 * 
 */
package q1;

import java.util.Scanner;

/**
 * This class takes user input as a double representing some monetary amount. The class provides a 
 * readout of the denominations needed for that amount with emphasis on the largest denominations first.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Change {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a monetary amount:");
		double amount = scan.nextDouble();

		double tenDollars;
		double fiveDollars;
		double toonies;
		double loonies;
		double quarters;
		double dimes;
		double nickels;
		double pennies;

		tenDollars = (int) amount / 10;
		fiveDollars = ((int) amount - ((int) tenDollars * 10)) / 5;
		toonies = ((int) amount - ((int) tenDollars) * 10 - ((int) fiveDollars) * 5) / 2;
		loonies = ((int) amount - ((int) tenDollars) * 10 - ((int) fiveDollars) * 5 - ((int) toonies) * 2);
		quarters = ((amount - (int) amount) * 100) / 25;
		dimes = (((amount - (int) amount) * 100) - ((int) quarters * 25)) / 10;
		nickels = (((amount - (int) amount) * 100) - ((int) quarters * 25) - ((int) dimes * 10)) / 5;
		pennies = (((amount - (int) amount) * 100) - ((int) quarters * 25) - ((int) dimes * 10) - ((int) nickels * 5));

		int tenDollarBillsNeeded = (int) tenDollars;
		int fiveDollarBillsNeeded = (int) fiveDollars;
		int tooniesNeeded = (int) toonies;
		int looniesNeeded = (int) loonies;
		int quartersNeeded = (int) quarters;
		int dimesNeeded = (int) dimes;
		int nickelsNeeded = (int) nickels;
		int penniesNeeded = (int) pennies;

		System.out.println(tenDollarBillsNeeded + " ten dollar bills\n" + fiveDollarBillsNeeded + " five dollar bills\n"
				+ tooniesNeeded + " toonies\n" + looniesNeeded + " loonies\n" + quartersNeeded + " quarters\n" + dimesNeeded
				+ " dimes\n" + nickelsNeeded + " nickels\n" + penniesNeeded + " pennies");

	}

}
