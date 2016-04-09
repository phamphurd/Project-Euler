/*
 * Problem Description:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class LargestPrimeFactor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		//Ask for the number
		System.out.println("What number do you want to find the largest prime factor of? ");
		List<Long>factors = simpleFactor(Long.parseLong(reader.readLine()));
		System.out.println("All factors: " + factors);
		System.out.println("The max prime factor is: " + Collections.max(factors));
	}
	
	/*
	 * Simple,brute force method to determine the prime number factors of a number, n
	 * return: int array
	 */
	public static List<Long> simpleFactor(long arg){
		
		List<Long>factors= new ArrayList<Long>();	//All factors of n
		long n = arg;
		long i = 2;		//Starting factor
		
		while(n>1){
			if(n%i == 0){			
				factors.add(i);
				n = n/i;
				i = i - 1;
			}
			i= i+1;
			if(i*i>arg){
				if(n>1){
					factors.add(n);
					break;
				}
			}
		}
		
		return factors;
	}

}
