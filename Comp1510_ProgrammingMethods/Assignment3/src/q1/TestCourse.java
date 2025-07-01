/**
 * 
 */
package q1;

/**
 * This class tests the Course class by creating two Students and enrolling them into a class.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class TestCourse {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
    public static void main(String[] args) {
        // Create some Address objects
        Address addr1 = new Address("123 Main St", "Vancouver", "BC", "V5K0A1");
        Address addr2 = new Address("456 Oak Ave", "Burnaby", "BC", "V5G1X2");
        Address addr3 = new Address("48902 Maple St", "Surrey", "BC", "V8I0D3");
        Address addr4 = new Address("1234 Yates St", "Richmond", "BC", "V9S3W8");

        // Create some Student objects
        Student s1 = new Student("Alice", "Smith", addr1, addr3, 78, 86, 90);
        Student s2 = new Student("Bob", "Johnson", addr2, addr4, 66, 45, 81);

        // Create a Course
        Course comp1510 = new Course("Programming Methods");

        // Add students to the course
        comp1510.addStudent(s1);
        comp1510.addStudent(s2);

        // Print the course name and student list
        System.out.println("Course Name: " + comp1510.getName());
        System.out.println("Enrolled Students:\n");
        comp1510.role();
        System.out.println("Overall Average of " + comp1510.getName() + ": " + comp1510.averag());  
    }
}

