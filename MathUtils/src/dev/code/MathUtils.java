package dev.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.NotActiveException;
import java.math.BigInteger;
import java.text.BreakIterator;

/**
 * 
 * @author md
 * 
 */
public class MathUtils {

	/**
	 * Get distance between two x/y coordinates
	 * 
	 * @param x2
	 *            Value for X2
	 * @param x1
	 *            Value for X1
	 * @param y2
	 *            Value for Y2
	 * @param y1
	 *            Value for Y1
	 * @return Retuns distance
	 */
	public static double getDistance(double x2, double x1, double y2, double y1) {
		double distance = 0;

		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		return distance;
	}

	/**
	 * Based on double passed in, will generate factorial
	 * 
	 * @param n
	 *            Double for number to be factored via factorial
	 * @return Factorial result
	 */
	public static double factorial(double n) {
		double recursive = 0, result = 0;
		System.out.println("Starting... " + n + " " + recursive);
		if (n == 0) {
			result = 1;
		} else {
			recursive = factorial(n - 1);
			result = n * recursive;
		}
		return result;
	}

	/**
	 * Factorial using iterative for loop
	 * 
	 * @param n
	 *            Integer for factorial
	 * @return Returns factorial
	 */
	public static double myexp(double n) {
		double factorial = 0;
		double x = 0;

		// factorial = n;
		for (double i = 1; i <= n; i++) {
			x = (i + 1);
			if (i == 1) {
				factorial = 1;
			} else {
				factorial = factorial * (i);
				System.out.println("Factorial on loop i: " + i + " is: "
						+ factorial + " i-1 " + (x));
			}
		}

		return factorial;
	}

	// calculate Fibonacci sequence
	/**
	 * Fibonacci algorithm via for loop
	 * 
	 * @param n
	 *            integer to run through Fibonacci algorithm
	 * @return returns Fibonacci
	 */
	public static int fib(int n) {
		int fib = 0;
		int i, start = 0;
		int seed = 0;
		int[] fibArray;
		fibArray = new int[n + 1];

		for (int j = 0; j <= n; j++) {
			if (j <= 1) {
				fibArray[j] = j;
			} else {
				fibArray[j] = fibArray[j - 1] + fibArray[j - 2];
			}
		}
		for (int j = 0; j <= n; j++) {
			fib = fibArray[j];
			if (j == n) {
				System.out.println("Fib is: " + fib);
			}
		}
		return fib;
	}

	/**
	 * Recursive Fibonacci
	 * 
	 * @param n
	 *            Integer
	 * @return Returns Fibonacci #
	 */
	public static int recursiveFib(int n) {
		int fib = 0;
		int i, start = 0;
		int seed = 0;
		int[] fibArray;
		if (n <= 1) {
			fib = n;
		} else {
			fib = recursiveFib(n - 1) + recursiveFib(n - 2);
		}
		return fib;
	}

	public static BigInteger ack(BigInteger m, BigInteger n) {

		BigInteger result = BigInteger.ONE;

		if (m.signum() == 0) {
			result = n.add(BigInteger.ONE);
			return result;
		}
		if (m.signum() > 0 && n.signum() == 0) {
			return ack(m.subtract(BigInteger.ONE), BigInteger.ONE);
		}
		return ack(m.subtract(BigInteger.ONE),
				ack(m, n.subtract(BigInteger.ONE)));
	}

	/**
	 * Euclidean algorithm is a way to find the greatest common divisor of two
	 * positive integers, a and b. The process is based on the observation that,
	 * if r is the remainder when a is divided by b, then the common divisors of
	 * a and b are the same as the common divisors of b and r.
	 * 
	 * @param a
	 *            Integer a
	 * @param b
	 *            Integer b
	 * @return Returns greatest common denominator
	 */
	public static Integer gcd(int a, int b) {
		int result = 0;
		int r = 0, modr = 0;
		r = a % b;

		if (r > 0) {
			modr = r;
			modr = gcd(b, r);
		} else {
			modr = b;
		}
		return modr;
	}

	/**
	 * Collatz conjecture Take any natural number n. If n is even, divide it by
	 * 2 to get n / 2. If n is odd, multiply it by 3 and add 1 to obtain 3n + 1.
	 * Repeat the process (which has been called "Half Or Triple Plus One", or
	 * HOTPO[6]) indefinitely. The conjecture is that no matter what number you
	 * start with, you will always eventually reach 1. The property has also
	 * been called oneness
	 */

	public static Integer collatz(int n, boolean display) {
		int i = 0;

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3) + 1;
			}
			if (display) {
				System.out.println("n is: " + n + " for iteration: " + i);
			}
			i++;
		}
		return n;
	}

	/**
	 * checkIfPrime will check to see if an integer is prime or not.Prime
	 * numbers are positive, non-zero numbers that have exactly two factors --
	 * no more, no less.
	 * 
	 * @param n
	 *            Integer to check to see if prime
	 * @return Returns boolean true if prime, false if not.
	 * 
	 */
	public static boolean checkIfPrime(int n) {
		boolean prime = false;
		int result = 0;

		if (n == 2) {
			prime = true;
		} else {
			for (int i = 2; i < n; i++) {
				result = n % i;
				if (result == 0) {
					prime = false;
					return prime;
				} else {
					prime = true;
				}
			}
		}
		return prime;
	}

	private static boolean isNumeric(String s) {
		boolean isNumeric = false;
		double doub = 0.0;
		int chkInt;

		try {
			chkInt = Integer.valueOf(s);
			isNumeric = true;

		} catch (NumberFormatException e) {
			isNumeric = false;
			// e.printStackTrace();
		}
		return isNumeric;
	}

	public static int getInteger(String var) {
		int returnInt = 0;
		String inString;
		boolean isNumeric = false;
		boolean process = true;

		while (process) {
			try {
				System.out.println("Enter value for " + var + " here: ");
				BufferedReader bufferRead = new BufferedReader(
						new InputStreamReader(System.in));
				inString = bufferRead.readLine();

				System.out.println(inString);

				if (inString.contentEquals("x")) {
					break;
				}
				isNumeric = isNumeric(inString);
				if (isNumeric) {
					returnInt = Integer.valueOf(inString);
					System.out
							.println("Value for " + var + " is: " + returnInt);
					break;
				} else {
					System.out
							.println("Please enter a numeric value or enter x to exit: ");
				}

			} catch (IOException e) {
				System.out.println("IOException hit!");
				// e.printStackTrace();
			}
		}
		return returnInt;
	}

}
