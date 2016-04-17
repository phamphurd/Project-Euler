/*
 * Problem Description:
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * NOTE: This method uses the Sieve of Erathosthenes: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */

import java.util.*;

public class SummationOfPrimes {

	public static void main(String[] args) {
		//Variables
		int n = 2000000;
		List<Boolean> sieveResults;
		long sum = 0;
		
		//Get sieved results
		sieveResults = primeSieve(n);
		
		//Add together all true values (primes) in the sieve results
		for(int z = 2; z<n+1; z++){
			if(sieveResults.get(z)){
				sum += z;
			}
		}
		System.out.println(sum);

	}
	
	public static List<Boolean> primeSieve(int maximum){
		//Set up list of booleans and fill with all true
		List<Boolean> listOfPrimes = new ArrayList<Boolean>(Arrays.asList(new Boolean[maximum+1]));
		Collections.fill(listOfPrimes, Boolean.TRUE);
		
		//Iterate through base values, starts at 2 to skip 0 and 1
		for(int i = 2; i<Math.round(Math.sqrt(maximum)) + 1; i++){
			//Iterate through multiples, starts at 2 to skip 0 and 1
			for(int j = 2; j*i<maximum+1;j++){
				listOfPrimes.set(j*i, Boolean.FALSE);
			}
		}
		
		return listOfPrimes;
	}

}
