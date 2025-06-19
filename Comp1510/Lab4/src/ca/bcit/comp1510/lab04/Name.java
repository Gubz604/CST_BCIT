/**
 * 
 */
package ca.bcit.comp1510.lab04;

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
	
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}

}
