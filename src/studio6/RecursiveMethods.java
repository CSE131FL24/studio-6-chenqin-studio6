package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if (n == 0) {
			return 0;
		} else {
			return Math.pow(0.5, n) + geometricSum(n-1);		}
		
		
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		if (radius <= radiusMinimumDrawingThreshold) {
			return;
		}
		
		// FIXME
		StdDraw.circle(xCenter, yCenter, radius);
		
		//Top
		circlesUponCircles(xCenter, yCenter + radius, radius/3, radiusMinimumDrawingThreshold);
		
		//Bottom
		circlesUponCircles(xCenter, yCenter - radius, radius/3, radiusMinimumDrawingThreshold);
		
		//Right
		circlesUponCircles(xCenter + radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		
		//Left
		circlesUponCircles(xCenter - radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int i = 0;
		int[] toReturn = new int[array.length];
		return reversedHelper(array, toReturn, i);
		
		
			// FIXME create a helper method that can recursively reverse the given array
			//return new int[0];
		
	}
	
	public static int[] reversedHelper(int[] array, int[] revArray, int i) {
		if (i >= array.length/2.0) {
			return revArray;
		}
		else {
			int mirrored_index = array.length - 1 - i;
			revArray[i] = array[mirrored_index];
			revArray[mirrored_index] = array[i];
			
			return reversedHelper(array, revArray, i + 1);
		}
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		if (q == 0) {
			return p;
		} else {
			return gcd(q, p%q);
		}
		
	}

}
