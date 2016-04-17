/*
 * Problem Description:
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

import java.util.*;

public class SumSquareDifference {

	public static void main(String[] args) {
		//Variables
		int range = 100;
		long sumofSquares = 0;
		long squareofSums = 0;
		long difference = 0;
		
		//Get the sum of squares and 
		for(int i = 1; i <= range; i++){
			sumofSquares = sumofSquares + (long) Math.pow((double) i, 2);
			squareofSums = squareofSums + i;
		}
		
		squareofSums = (long) Math.pow(squareofSums, 2);
		difference = squareofSums - sumofSquares;
		
		System.out.print(difference);
	}

}
