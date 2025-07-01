/**
 * 
 */
package ca.bcit.comp1510.lab05;

/**
 * This class highlights the use of private instance variables, a basic constructor as well as accessors and mutators.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Name {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String name) {
		middleName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}
	
	public int nameLength() {
		return firstName.length() + middleName.length() + lastName.length();
	}
	
	public String initials() {
		String firstInitial = firstName.substring(0, 1).toUpperCase();
		String middleInitial = middleName.substring(0, 1).toUpperCase();
		String lastInitial = lastName.substring(0, 1).toUpperCase();
		return firstInitial + middleInitial + lastInitial;
	}
	
	public char nthChar(int n) {
		String fullName = firstName + middleName + lastName;
		return fullName.charAt(n - 1);
	}
	
	public String lastNameFirst() {
		return lastName + ", " + firstName + " " + middleName;
	}
	
	public boolean isFirstname(String name) {
		return firstName.equals(name);
	}
	
	public boolean isName(Name name) {
		return this.firstName.equals(name.firstName) &&
				this.middleName.equals(name.middleName) &&
				this.lastName.equals(name.lastName);
	}
	
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}

}
