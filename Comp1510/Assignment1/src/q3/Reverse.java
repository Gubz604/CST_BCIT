/**
 * 
 */
package q3;

import java.util.Scanner;
import java.util.Stack;

/**
 * This class utilizes the Java Stack class in the java utils library to store 10 words and then output them
 * in reverse order using the Stack class' push and pop methods.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Reverse {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		int wordsInSentence = 10;
		
		for (int i = 0; i < wordsInSentence; i++) {
			System.out.println("Enter word:");
			String word = scan.next();
			stack.push(word);
		}
		
		for (int i = 0; i < wordsInSentence; i++) {
			System.out.println(stack.pop());
		}

	}

}
