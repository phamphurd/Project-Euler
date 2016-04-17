/*
 * Problem Description:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number? 
 */

import java.util.*;

public class Prime10001st {

	public static void main(String[] args) {
		//Variables
		long goal = 10001;
		long primeNumber = 0;
		long max = 0;
		List<Long>primes;
		long i = 2;
		
		do{
			primes = LargestPrimeFactor.simpleFactor(i);
			max = (long) Collections.max(primes);
			if(i == max){
				System.out.println(i);
				primeNumber++;
			}
			i++;
			
		}while(primeNumber < goal);

	}

}
