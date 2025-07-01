/**
 * 
 */
package ca.bcit.comp1510.lab08;

import java.util.Scanner;
import java.util.Random;

/**
 * This class creates a menu for two games to be played. The first game has the player guess a randomly chosen number between 0-100.
 * The second game is a game of Rock, Paper, Scissors.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Games {

	private int score;
	private Scanner scan;
	private Random rand;

	public Games() {
		this.score = 0;
		this.scan = new Scanner(System.in);
		this.rand = new Random();
	}

	public void play() {
		boolean flag = true;

		while (flag) {
			System.out.println("Welcome to the Games program!" + "\nMake your choice (enter a number)"
					+ "\n1. See your score" + "\n2. Guess a number" + "\n3. Play Rock, Paper, Scissors" + "\n4. Quit");
			int option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("Score: " + score);
				break;
			case 2:
				guessANumber();
				break;
			case 3:
				rockPaperScissors();
				break;
			case 4:
				flag = false;
				System.out.println("Thank you for playing! See you next time!!");
				break;
			default:
				System.out.println("That is now a valid choice!");
				break;
			}

		}

	}

	public void guessANumber() {
		int guessCounter = 0;
		int num = rand.nextInt(101);
		boolean flag = true;

		System.out.println("I've picked a random number between 0 and 100\nCan you guess it?");
		int guess;
		while (flag) {
			System.out.println("Guess the number!");
			guess = scan.nextInt();
			if (guess > num) {
				System.out.println("Too high, guess again!");
				guessCounter++;
			} else if (guess < num) {
				System.out.println("Too low, guess again!");
				guessCounter++;
			} else if (guess == num) {
				System.out.println("RIGHT!");
				flag = false;
				if (guessCounter < 5) {
					System.out.println("Five points!");
					score += 5;
				}
			}
		}
	}

	public void rockPaperScissors() {
		int type = rand.nextInt(3);
		boolean flag = true;
		scan.nextLine();

		System.out.println("I've picked one of ROCK, PAPER, and SCISSORS\nWhich one do you choose?");
		while (flag) {
			String option = scan.nextLine();
			if (option.equals("rock") || option.equals("paper") || option.equals("scissors")) {
				switch (type) {
				case 0:
					if (option.equals("rock")) {
						System.out.println("TIE! No points allocated");
					} else if (option.equals("paper")) {
						System.out.println("YOU WIN! Paper wraps rock\nFive Points!");
						score += 5;
					} else if (option.equals("scissors")) {
						System.out.println("YOU LOSE! Rock smashes scissors\nMinus Three Points!");
						score -= 3;
					}
					break;
				case 1:
					if (option.equals("paper")) {
						System.out.println("TIE! No points allocated");
					} else if (option.equals("scissors")) {
						System.out.println("YOU WIN! Scissors cut paper\nFive Points!");
						score += 5;
					} else if (option.equals("rock")) {
						System.out.println("YOU LOSE! Paper wraps rock\nMinus Three Points!");
						score -= 3;
					}
					break;
				case 2:
					if (option.equals("scissors")) {
						System.out.println("TIE! No points allocated");
					} else if (option.equals("rock")) {
						System.out.println("YOU WIN! Rock smashes scissors\nFive Points");
						score += 5;
					} else if (option.equals("paper")) {
						System.out.println("YOU LOSE! Scissors cut paper\nMinus Three points");
						score -= 3;
					}
					break;
				}
				flag = false;
			} else {
				System.out.println("That's not a valid choice! Try again!");
			}
		}
	}

}
