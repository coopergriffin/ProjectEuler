//Cooper Griffin
//April 15th 2018
//Project Euler 5 Smallest multiple
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/


public class ProjectEuler5{
	public static void main(String[] args){

	}

	public static int lcmFactorial(int n){
		boolean status = true;
		int count = 0;
		int result = 0;
		while(status == true){
			result = count * n;
			for(int i = 1; i < 20; i++){
				if(result % i != 0){
					break
				}

			}
		}
	}
}