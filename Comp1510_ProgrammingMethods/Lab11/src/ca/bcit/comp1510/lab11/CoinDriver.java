/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * This class tests the interface Lockable as implemented in the Coin class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class CoinDriver {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Coin coin = new Coin();
		
		coin.setKey(9);
		System.out.println(coin.locked());
		
		coin.lock(9);
		System.out.println(coin.locked());
		
		coin.flip();
		
		coin.unlock(9);
		System.out.println(coin.locked());
		
	}

}
