/*
 * Problem Description
 * The following iterative sequence is defined for the set of positive integers:

n > n/2 (n is even)
n > 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 > 40 > 20 > 10 > 5 > 16 > 8 > 4 > 2 > 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		//Variables
		long currentChain = 1;
		long maxChain = 1;
		long maxChainNumber = 1;
		long maxNumbers = 1000000;
		long currentNumber = 1;
		
		//Iterate through all of max numbers
		for(long i = 1; i<=maxNumbers; i++){
			currentNumber = i;	//Set the current number to the iteration
			currentChain = 1;	//Reset current chain
			//Continue looping until the current number reaches one
			while(currentNumber != 1){
				//Check if number is even
				if(currentNumber%2 == 0){
					currentNumber = collatzEven(currentNumber);
					currentChain++;	//Increment current chain
				}else{	//Current number is odd
					currentNumber = collatzOdd(currentNumber);
					currentChain++;	//Increment current chain
				}
			}
			//Check if the current chain exceeds the max chain
			if(currentChain > maxChain){
				maxChain = currentChain;
				maxChainNumber = i;
			}
			System.out.println(currentChain);
		}
		
		//Print the max chain number
		System.out.println("Number with the maximum chains: " + maxChainNumber);
	}
	
	public static long collatzOdd(long num){
		long newNum = (num*3)+1;	
		return newNum;
	}
	
	public static long collatzEven(long num){
		long newNum = num/2;
		return newNum;
	}

}
