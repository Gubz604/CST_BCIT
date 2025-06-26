/**
 * 
 */
package q1;

/**
 * This class tests the Cylinder class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class MultiCylinder {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Cylinder cylinder1 = new Cylinder(5, 4);
		Cylinder cylinder2 = new Cylinder(2, 9);
		
		System.out.println("Unmodified Cylinders:\n" + "Cylinder 1 -- " + cylinder1 + "\nCylinder 2 -- " + cylinder2);
		
		cylinder1.setHeight(3);
		cylinder1.setRadius(2);
		cylinder2.setHeight(5);
		cylinder2.setHeight(4);
		
		System.out.println("Modified Cylinders:\n" + "Cylinder 1 -- " + cylinder1 + "\nCylinder 2 -- " + cylinder2);
		
		
		System.out.println("Cylinder 1: Surface Area - " + cylinder1.surfaceArea() + "; Volume - " + cylinder1.volume());
		System.out.println("Cylinder 2: Surface Area - " + cylinder2.surfaceArea() + "; Volume - " + cylinder2.volume());	
	}
}
