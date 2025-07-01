/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * Simply used to test Random Walker.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class TestWalker {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		RandomWalker test = new RandomWalker(10, 5);
		
		
		
		for (int i = 0; i < 5; i++) {
			test.takeStep();
			System.out.println(test);
			System.out.println("Max Distance: " + test.getMaximumDistance() + "\n");
			
		}

	}

}
