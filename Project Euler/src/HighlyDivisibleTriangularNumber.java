/*
 * Problem Description:
 * The sequence of triangle numbers is generated by adding the natural numbers. 
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
 * The first ten terms would be: 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * Let us list the factors of the first seven triangle numbers:
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * 
 * What is the value of the first triangle number to have over five hundred divisors?
 */

/*
 * The sqrt of the trinumber is used because if the number, d, greater than the sqrt(trinumber),
 * divided by the trinumber, n, would be a factor smaller than the sqrt(trinumber).
 * The divisors is doubled to account for each number that is higher than the sqrt(trinumber).
 */
public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		//Variables
		int numDivisors = 500;
		int divisors = 0;
		int triNumber = 1;
		int iterator = 1;
		
		//Continually loop through numbers until reaching wanted number of divisors
		while(divisors <= numDivisors-1){
			//Reset divisors to 0
			divisors = 0;
			//Go through all factors in the triNumber until it reaches the sqrt of the triNumber
			for(int i = 1; i<=Math.sqrt(triNumber); i++){
				//Get factor of triangular number for each iteration
				if(triNumber%i == 0){
					divisors++;
				}
			}
			System.out.println("TriNumber: " + triNumber + " Divisors: " + divisors*2);	//Print the trinumber and divisors
			//Determine if the number of divisors * 2 is greater than the numDivisors
			if(divisors*2 > numDivisors-1){
				break;
			}else{
				//Increase iterator
				iterator++;
				//Get next triangular number
				triNumber+=iterator;
			}
		}
		System.out.println("Triangular Number: " + triNumber);
	}
}
