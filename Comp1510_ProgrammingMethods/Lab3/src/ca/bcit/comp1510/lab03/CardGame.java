/**
 * 
 */
package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * This class highlights Enumerated types and Java's Enums.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class CardGame {
	
	public enum Rank {
		ace,
		two,
		three,
		four,
		five,
		six,
		seven,
		eight,
		nine,
		ten,
		jack,
		queen,
		king
	}
	
	public enum Suite {
		hearts,
		diamonds,
		clubs,
		spades
	}

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		
		int randomRankChoice = rand.nextInt(Rank.values().length);
		Rank randomRank = Rank.values()[randomRankChoice];
		
		int randomSuiteChoice =rand.nextInt(Suite.values().length);
		Suite randomSuite = Suite.values()[randomSuiteChoice];
		
		System.out.println(randomRank + " of " + randomSuite);

	}

}
