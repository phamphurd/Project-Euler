/*
 * Problem Description: 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.*;

public class SmallestMultiple {

	public static int[] RANGE = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	public static int[] PRIMES = {2,3,5,7,11,13,17,19};		//Prime numbers in the above range
	
	public static void main(String[] args) {
		//Set the number of each prime, which corresponds to each value in PRIMES
		int[] numprimes = {0,0,0,0,0,0,0,0};
		//iterate through all values in RANGE
		for(int z = 0; z<RANGE.length; z++){
			//Get the number of primes in each value
			//Get the maximum count of each prime for each value
			getPrimeCount(RANGE[z],numprimes);
			System.out.println(Arrays.toString(numprimes));
		}
		//Output the answer
		System.out.println(getSmallestMultiple(PRIMES,numprimes));
	}
	
	public static void getPrimeCount(int arg, int[] numberofprimes){
		//Variables
		int count = 0;
		List<Long>primes= LargestPrimeFactor.simpleFactor(arg);
		
		//iterate through the range of primes
		for(int i = 0; i<PRIMES.length; i++){
			//Get the count of each prime
			count = Collections.frequency(primes, (long) PRIMES[i]);
			//Check if it is the maximum count of that prime number, if so, then replace the current count
			numberofprimes[i] = (numberofprimes[i]<count)?count:numberofprimes[i];
		}
	}
	
	public static long getSmallestMultiple(int[] primes, int[] numberofprimes){
		//Variables
		long smallestMultiple = 1;
		
		//iterate through the range of primes
		for(int x = 0; x<primes.length; x++){
			//get the smallest multiple by multiplying all the primes to the power of the corresponding numprm value
			smallestMultiple = Math.multiplyExact(smallestMultiple, (long) Math.pow(primes[x], numberofprimes[x]));
		}
		
		return smallestMultiple;
	}

}
