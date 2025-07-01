/**
 * 
 */
package q4;

import java.util.Scanner;

/**
 * This class encodes a String input from the user and converts it to a MIX-character string.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Pack {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a valid 5 character string:");
		String input = scan.nextLine();
		
		char c1;
		char c2;
		char c3; 
		char c4;
		char c5;
		
		c1 = input.charAt(0);
		c2 = input.charAt(1);
		c3 = input.charAt(2);
		c4 = input.charAt(3);
		c5 = input.charAt(4);
		
		int c1Value = c1 - 'A' + 1;
		int c2Value = c2 - 'A' + 1;
		int c3Value = c3 - 'A' + 1;
		int c4Value = c4 - 'A' + 1;
		int c5Value = c5 - 'A' + 1;

		int encoded = ((((c1Value * 56 + c2Value) * 56 + c3Value) * 56 + c4Value) * 56 + c5Value);
		
		System.out.println("Encoded: " + encoded);

		int temp = encoded;
		int d5 = temp % 56;
		temp /= 56;
		int d4 = temp % 56;
		temp /= 56;
		int d3 = temp % 56;
		temp /= 56;
		int d2 = temp % 56;
		temp /= 56;
		int d1 = temp;

		
		char dc1 = (char)(d1 - 1 + 'A');
		char dc2 = (char)(d2 - 1 + 'A');
		char dc3 = (char)(d3 - 1 + 'A');
		char dc4 = (char)(d4 - 1 + 'A');
		char dc5 = (char)(d5 - 1 + 'A');

		System.out.println("Decoded: " + "" + dc1 + dc2 + dc3 + dc4 + dc5);

	}

}
