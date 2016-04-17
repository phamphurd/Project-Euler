/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		//Variables
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		int product = 0;
		
		//Iterate through x, which corresponds to a
		for(int x = 1; x<998; x++){
			//Iterate through y, which corresponds to b
			for(int y = 1; y<999; y++){
				//Iterate through z, which corresponds to c
				for(int z = 1; z<1000; z++){
					//Check if x<y<z, else go to next value
					if(x<y && y<z){
						//Check if x+y+z=1000, else go to next value
						if((x+y+z) == 1000){
							//Get a^2 + b^2
							sum = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
							//Get c^2
							product = (int) Math.pow(z,2);
							//Check if a^2+b^2 = c^2, else go to next value
							if(sum == product){
								//Assign x to a, y to b, z to c
								a = x;
								b = y;
								c = z;
								break;
							}else{
								continue;
							}
						}else{
							continue;
						}
					}else{
						continue;
					}
				}
			}
		}
		
		//Output a,b,c and a*b*c
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a*b*c);

	}

}
