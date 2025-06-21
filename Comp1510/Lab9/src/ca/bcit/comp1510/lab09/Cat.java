/**
 * 
 */
package ca.bcit.comp1510.lab09;

/**
 * This class creats a Cat object with a name and age.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Cat {
	
	private final String name;
	private int age;
	
	public Cat(String name, int age) {
		
		if (name.isBlank() || name.isEmpty()) {
			this.name = "Cleo";
		} else this.name = name;
		
		if (age < 0) this.age = 0;
		else this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String toString() {
		return name + " is " + age + " years old.";
	}

}
