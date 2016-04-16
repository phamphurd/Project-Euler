import java.util.*;

/*
 * Problem Description:
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */


public class LargestPalindrome {

	public static void main(String[] args) {
		//Variables
		int max = 0;
		
		//Iterate through first number
		for(int x = 999; x>900; x--){
			for(int y = 999; y>900; y--){
				if(palindromeCheck(x,y)){
					max = max<(x*y) ? x*y:max; //Set max value to new product if it is higher
				}
			}	
		}
		System.out.println(max);
	}
	
	public static boolean palindromeCheck(int x, int y){
		//Variables
		int product = x*y;	//product
		String productString = Integer.toString(product); //Change product to string
		String reverseString = new StringBuffer(productString).reverse().toString(); //reverse string order
		if(productString.equals(reverseString)){ // compare the two strings
			return true;
		}else{
			return false;
		}
	}
}
