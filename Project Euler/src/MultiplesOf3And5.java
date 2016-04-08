/*
 * Problem Statement:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * https://projecteuler.net/problem=1
 */

import java.util.Scanner;

public class MultiplesOf3And5 {
	public static void main(String[] args) {
		/*
		 * Read
		 */
		//Declare variables
		int numMultiples = 0;
		int limit = 0;
		int[] multiples;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		//Get the number of multiples to be used
		System.out.print("Enter the number of Multiples: ");
		System.out.println("");
		numMultiples = scan.nextInt();
		multiples = new int[numMultiples];
		
		//Get all of the multiples used
		for(int i=0; i<numMultiples;i++){
			int number = i+1;
			System.out.print("Enter the multiple number " + number + ": ");
			System.out.println("");
			multiples[i] = scan.nextInt();
		}
		
		//Get the limit number
		System.out.print("Enter the limit: ");
		System.out.println("");
		limit = scan.nextInt();
		
		/*
		 * Think and do
		 */
		//Iterate through all numbers from 1 to the limit
		for(int x = 1; x<limit; x++){
			//Iterate through all multiples given
			for(int y = 0; y<numMultiples; y++){
				//Check if the current number is a multiple
				if(x%multiples[y] == 0){
					System.out.println(x);
					//Add to sum
					sum = sum + x;
					break;
				}
			}
		}
		System.out.println("Your sum is: " + sum);
		scan.close();
	}
	
}
