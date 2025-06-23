/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * This class tests the equals method of the Player class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class ComparePlayer {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Player[] players = new Player[2];
		Player player1 = new Player("Dougie", "Tigers", 8);
		Player player2 = new Player("Gurvir", "Lions", 2);
		players[0] = player1;
		players[1] = player2;
 
		System.out.println("Is this player the same as that player?? " + player1.equals(player2));
		System.out.println("Is THIS player the same as THAT player?? " + player1.equals(player1));

	}

}
