package piCalc;

import java.util.Scanner;

public class Pi {
	static int primeCount = 0;
	static int total = 0;

	public Pi() {

	}

	// Euclid's algorithm to find GCD.
	public long gcd(long a, long b) {

		while (b > 0) {

			long temp = b;
			b = a % b; // % is remainder
			a = temp;
		}

		return a;
	}

	public static void main(String[] args) {
		Pi calc = new Pi();
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter count for total number and prime count.
		// Enter pi to calcuate pi."); More user input
		while (true) {
			if (calc.gcd(Math.round(Math.random() * 1000000000), Math.round(Math.random() * 1000000000)) == 1) { // Feeds
																													// random
																													// numbers
																													// into
																													// GCD
																													// formula
				primeCount++;
				total++;
				System.out.println("Pi is approximately "+(Math.sqrt(6/(total/primeCount)))+". Maybe? "+primeCount+" "+total);//This is the formula to find pi.

			} else
				total++;

			if (total == 100) {

				System.exit(0);
			}
			/*
			 * My attempt a user input. using this code breaks the program and
			 * does not read lines.
			 * 
			 *  if(scanner.nextLine()=="count"){
			 * 
			 * System.out.println("There has been "
			 * +primeCount+" prime BCD out of "+total+" random pairs.");
			 * 
			 * } if(scanner.nextLine()=="pi"){
			 * 
			 * System.out.println("Pi is approximately "+(Math.sqrt(6/(total/
			 * primeCount)))+". Maybe?");
			 * 
			 * }
			 */
		}
	}
}
