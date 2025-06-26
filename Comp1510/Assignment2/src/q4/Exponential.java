package q4;

/**
 * This class uses the infinite sum of the exponential function to calculate it.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Exponential {

    public static double exp(double x) {
        double sum = 1.0;  
        double term = 1.0; 
        int k = 1;

        while (Math.abs(term) > 1e-15) { 
            term *= x / k;   
            sum += term;
            k++;
        }

        return sum;
    }

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("x\t\te^x");
        for (double x = -10.0; x <= 10.0; x += 1.0) {
            double result = exp(x);
            System.out.printf("%-8.1f\t%.10f%n", x, result);
        }
    }
}
