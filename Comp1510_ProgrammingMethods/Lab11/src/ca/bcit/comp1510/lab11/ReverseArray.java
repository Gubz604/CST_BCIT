/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * In this class an array of ints is created. The size is determined by the user and filled with user inputted 
 * values. The array's contents are displayed, reversed and displayed again.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class ReverseArray {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you wish to enter?");
		int size = scan.nextInt();
		
		int[] numbers = new int [size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Number " + (i + 1) + ": ");
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("Original Array");
		for (int num : numbers) {
			System.out.println(num);
		}
		
		for (int i = 0; i < numbers.length / 2; i++) {
			swap(numbers, i, numbers.length - 1 - i);
		}
		
		System.out.println("Reversed Array");
		for (int num: numbers) {
			System.out.println(num);
		}
		
		scan.close();	
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}