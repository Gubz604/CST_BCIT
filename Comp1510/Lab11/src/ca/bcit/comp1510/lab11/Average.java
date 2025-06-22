/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * This class uses command line arguments to calculate an average using doubles received from the user.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 */
public class Average {

	/**
	 * Drives the program.
	 * 
	 * @param args values of doubles input by user for calculation of an average
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No arguments");
			return;
		}

		System.out.println("Command line arguments:");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		System.out.println("\nCalculating average...");

		int sum = 0;
		int validCount = 0;
		boolean hasInvalidInput = false;

		for (int i = 0; i < args.length; i++) {
			try {
				int number = Integer.parseInt(args[i]);
				sum += number;
				validCount++;
			} catch (NumberFormatException e) {
				System.out.println("Error: '" + args[i] + "' is not a valid integer.");
				hasInvalidInput = true;
			}
		}


		if (hasInvalidInput) {
			System.out.println("Some arguments were not valid integers.");
			if (validCount == 0) {
				System.out.println("No valid integers found. Cannot calculate average.");
				return;
			} else {
				System.out.println("Calculating average using only valid integers...");
			}
		}

		double average = (double) sum / validCount;
		System.out.println("Sum: " + sum);
		System.out.println("Count of valid numbers: " + validCount);
		System.out.println("Average: " + average);
	}

}
