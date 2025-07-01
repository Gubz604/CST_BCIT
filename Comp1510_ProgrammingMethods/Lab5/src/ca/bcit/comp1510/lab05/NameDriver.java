/**
 * 
 */
package ca.bcit.comp1510.lab05;

/**
 * This class tests the expected output for the Name class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 */
public class NameDriver {

	/**
	 * Drives the program
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		String firstName = "Gurvir";
		String middleName = "Singh";
		String lastName = "Dhami";
		
		Name myName = new Name(firstName, middleName, lastName);
		
		System.out.println("Lenght of the name is: " + myName.nameLength());
		System.out.println("Initials of the name is: " + myName.initials());
		System.out.println("The 4th char in the name is: " + myName.nthChar(4));
		System.out.println("The facny way to write the name is " + myName.lastNameFirst());
		System.out.println("Is the first name Gurvir? " + myName.isFirstname("Gurvir"));
		System.out.println("Is the first name Edward? " + myName.isFirstname("Edward"));
		System.out.println("Is this name correct? " + myName.isName(myName));
		System.out.println("Is this name correct? " + myName.isName(new Name("Edward", "D.", "Teach")));

	}

}
