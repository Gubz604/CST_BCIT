package q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    private int score1;
    private int score2;
    private int score3;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.score1 = 0;
        this.score2 = 0;
        this.score3 = 0;
    }
    
    public Student(String first, String last, Address home, Address school, int score1, int score2, int score3) {
    	this(first, last, home, school);
    	this.score1 = score1;
    	this.score2 = score2;
    	this.score3 = score3;
    }
    
    public void setTestScore(int testNum, int score) {
    	switch (testNum) {
    	case 1:
    		score1 = score;
    		break;
    	case 2:
    		score2 = score;
    		break;
    	case 3:
    		score3 = score;
    		break;
    	}
    }
    
    public int getTestScore(int testNum) {
    	switch (testNum) {
    	case 1:
    		return score1;
    	case 2:
    		return score2;
    	case 3:
    		return score3;
    	default:
    		return -1;
    	}
    }
    
    public double average() {
    	return (score1 + score2 + score3) / 3;
    }

    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress +"\n";
        result += "Test Score 1: " + score1 + "\n";
        result += "Test Score 2: " + score2 + "\n";
        result += "Test Score 3: " + score3 + "\n";
        result += "Average Score is " + average();

        return result;
    }
}
