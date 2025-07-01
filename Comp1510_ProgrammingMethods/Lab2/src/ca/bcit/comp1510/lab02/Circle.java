/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * This class highlights the construction of a constant in Java and performs some basic arithmetic with it.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Circle {
	
	
	public static final double PI = 3.14159;

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double radius;
		System.out.println("Enter radius: ");
		radius = scan.nextDouble();
		
		double circumference = 2 * PI * radius;
		double area = PI * radius * radius;
		
		double doubleRadius = 2 * radius;
		double doubleCircumference = 2 * PI * doubleRadius;
		double doubleArea = PI * doubleRadius * doubleRadius;
		
		System.out.println("The circumference of the circle is: " + circumference);
		System.out.println("The area of the circle is: " + area);
		System.out.println("----------------------------------");
		System.out.println("Double the radius is: " + doubleRadius);
		System.out.println("The new circumference of the circle is: " + doubleCircumference);
		System.out.println("The new area of the circle is: " + doubleArea);
		System.out.println("\nThe new circumference is " + (doubleCircumference / circumference) + " times larger");
		System.out.println("The new area is " + (doubleArea / area) + " times larger");
		
		scan.close();
	}

}
