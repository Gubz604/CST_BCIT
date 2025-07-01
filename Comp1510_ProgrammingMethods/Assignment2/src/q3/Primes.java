/**
 * 
 */
package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program encapsulates the Sieve of Eratosthenes to count prime numbers up to an upper bound, n.
 * 
 *  @author Gurvir Dhami
 *  @version 1.0
 *  
 */
public class Primes {

	private ArrayList<Boolean> primes;

	public Primes(int n) {

		this.primes = new ArrayList<>(n + 1);
		for (int i = 0; i <= n; i++) {
			primes.add(true);
		}

		calculatePrimes(n);
	}
	
	private void calculatePrimes(int n) {
        if (n >= 0) primes.set(0, false);
        if (n >= 1) primes.set(1, false);

        for (int i = 2; i * i <= n; i++) {
            if (primes.get(i)) {
                for (int j = i * i; j <= n; j += i) {
                    primes.set(j, false);
                }
            }
        }
    }

    public void printPrimes() {
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public int countPrimes() {
        int count = 0;
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int x) {
        if (x < 0 || x >= primes.size()) {
            throw new IllegalArgumentException("Value out of range: " + x);
        }
        return primes.get(x);
    }

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an upper bound: ");
        int n = scan.nextInt();

        Primes p = new Primes(n);
        System.out.println("There are " + p.countPrimes() + " prime numbers between 0 and " + n + ".");
        System.out.println("The prime numbers are:");
        p.printPrimes();
        
        scan.close();
    }

}
