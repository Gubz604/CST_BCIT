/**
 * 
 */
package ca.bcit.comp1510.lab09;

/**
 * This class uses a for loop to flip a Coin object 100 times and displays the heads and tails as well as the longest run of heads.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class CoinRunner {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Coin coin = new Coin();
		
		int headsCounter = 0;
		int longestRun = 0;
		
		for (int i = 0; i < 100; i++) {
			coin.flip();
			if (coin.isHeads()) {
				System.out.println("HEADS");
				headsCounter += 1;
				if (headsCounter > longestRun) {
					longestRun = headsCounter;
				}
			} else {
				System.out.println("TAILS");
				headsCounter = 0;
			}
			
			if (i == 99) System.out.println("The longest run of heads is " + longestRun);
		}

	}

}
