/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * 
 */
public class Name implements Comparable<Name>{
	
	private final String firstName;
	private final String middleName;
	private final String lastName;
	
	public Name(String firstName, String middleName, String lastName) {
		
		if (firstName.isBlank() || firstName.isEmpty()) {
			throw new IllegalArgumentException("First Name cannot be empty or null");
		}
		
		if (lastName.isBlank() || lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be empty or null");
		}
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Name(String firstName, String lastName) {
		
		if (firstName.isBlank() || firstName.isEmpty()) {
			throw new IllegalArgumentException("First Name cannot be empty or null");
		}
		
		if (lastName.isBlank() || lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be empty or null");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = null;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}

	@Override
	public int compareTo(Name o) {
		if (this.lastName.compareTo(o.lastName) != 0) {
			return this.lastName.compareTo(o.lastName);
		} else if (this.firstName.compareTo(o.firstName) != 0) {
			return this.firstName.compareTo(o.firstName);
		} else if (this.middleName.compareTo(o.middleName) != 0) {
			return this.middleName.compareTo(o.middleName);
		} else return 0;
	}

}
