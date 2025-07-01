/**
 * 
 */
package ca.bcit.comp1510.lab04;

import java.util.Scanner;

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
		Scanner scan = new Scanner(System.in);
		
		String fName;
		String mName;
		String lName;
		
		System.out.println("Enter first, middle, and last name: ");
		fName = scan.nextLine();
		mName = scan.nextLine();
		lName = scan.nextLine();
		
		String fNameCapInitial = fName.substring(0, 1).toUpperCase();
		String mNameCapInitial = mName.substring(0, 1).toUpperCase();
		String lNameCapInitial = lName.substring(0, 1).toUpperCase();
		
		String fNameLower = fName.substring(1);
		String mNameLower = mName.substring(1);
		String lNameLower = lName.substring(1);
		
		String properFName = fNameCapInitial + fNameLower;
		String properMName = mNameCapInitial + mNameLower;
		String properLName = lNameCapInitial + lNameLower;
		
		Name name = new Name(fName, mName, lName);
		
		name.setFirstName(properFName);
		name.setMiddleName(properMName);
		name.setLastName(properLName);
		
		System.out.println(name);
		scan.close();
	}

}
