/**
 * 
 */
package ca.bcit.comp1510.lab03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class makes use of the Math class to determine the distance between two points.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Distance {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the x and y coordinates of the first point: ");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		
		System.out.println("Enter the x and y coordinates of the second point: ");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The distance between the two points is: " + distance);
		
		DecimalFormat format = new DecimalFormat("#.##");
		System.out.println(format.format(distance));
		
		scan.close();
	}

}
