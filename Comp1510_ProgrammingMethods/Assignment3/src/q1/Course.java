/**
 * 
 */
package q1;

import java.util.ArrayList;

/**
 * This class creates a Course object that stores the information of up to 5 students enrolled in the class. 
 * A Course will have a name and will calculate the overall average of the class. It will also print out all students 
 * enrolled in the class and their details.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Course {
	
	private String name;
	private int numStudents;
	private ArrayList <Student> studentList;
	
	public Course(String name) {
		this.name = name;
		numStudents = 0;
		studentList = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addStudent(Student student) {
		if (numStudents > 5) {
			return;
		} else {
			studentList.add(student);
			numStudents++;
		}
	}
	
	public double averag() {
		double average = 0;
		
		for (Student student : studentList) {
			average += student.average();
		}
		
		return average = average / numStudents;
	}
	
	public void role() {
		for (Student student : studentList) {
			System.out.println(student + "\n");
		}
	}
}
