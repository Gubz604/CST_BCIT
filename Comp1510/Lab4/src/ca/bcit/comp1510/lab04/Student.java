/**
 * 
 */
package ca.bcit.comp1510.lab04;

/**
 * 
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String studentNumber;
	private int gpa;
	
	public Student(
			String firstName, 
			String lastName, 
			int yearOfBirth, 
			String studentNumber, 
			int gpa
			) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.studentNumber = studentNumber;
		this.gpa = gpa;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}
	
	public int getBirthYear() {
		return yearOfBirth;
	}
	
	public void setBirthYear(int year) {
		yearOfBirth = year;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String stuNum) {
		studentNumber = stuNum;
	}
	
	public int getGradeAverage() {
		return gpa;
	}
	
	public void setGradeAverage(int grade) {
		gpa = grade;
	}
	
	public String toString() {
		return firstName + lastName + yearOfBirth + studentNumber + gpa;
	}
}
