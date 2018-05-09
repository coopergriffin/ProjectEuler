//Cooper Griffin
//Created on April 15 2018
//Project Euler Problem 1 Multiples of 3 and 5. 
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

//Answer is: 233168

public class ProjectEuler1{
	public static void main(String[] args){
		//Testing
		int sum = 0;

		for(int i = 0; i < 1000; i++){
			if(i % 3 == 0){
				sum += i;
				System.out.println(i + " Sum = " + sum);
			}else if(i % 5 == 0){
				sum += i;
				System.out.println(i + " Sum = " + sum);
			}
		}
	}
}
