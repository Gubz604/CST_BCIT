/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * This class tests the Random Walker by simulating two particles in set coordinates and waiting to
 * see if a collision occurs between them.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Collisions {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		RandomWalker rw1 = new RandomWalker(1000000, 2000000, -3, 0);
		RandomWalker rw2 = new RandomWalker(1000000, 2000000, 3, 0);
		
		int maxStepsAllowed = 1000;
		
		
		for (int i = 0; i < maxStepsAllowed; i++) {
			rw1.takeStep();
			rw2.takeStep();
			
			if (samePosition(rw1, rw2)) {
				System.out.println("Collision occured on step " + i +
				"\nMax Distance for particle 1 is " + rw1.getMaximumDistance() +
				"\nMax Distance for particle 2 is " + rw2.getMaximumDistance());
			} else if (i == maxStepsAllowed - 1) {
				System.out.println("End of Experiment");
			}
		}
	}
	
	public static boolean samePosition(RandomWalker rw1, RandomWalker rw2) {
		boolean xMatch = rw1.getXCoordinate() == rw2.getXCoordinate();
		boolean yMatch = rw1.getYCoordinate() == rw2.getYCoordinate();
		
		return xMatch && yMatch;
	}

}
