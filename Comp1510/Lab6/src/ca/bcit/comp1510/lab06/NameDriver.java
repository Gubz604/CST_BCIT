/**
 * 
 */
package ca.bcit.comp1510.lab06;

/**
 * This class is used to test the Name class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class NameDriver {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Name name1 = new Name("Gurvir", "Singh", "Dhami");
		Name name2 = new Name(" ", " ", " ");
		Name name3 = new Name("", "", "");
		Name name4 = new Name("", " ", "      ");
		Name name5 = new Name("Gurvir", "", " ");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);

	}

}
