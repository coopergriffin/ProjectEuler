//Cooper Griffin
//April 15th 2018
//Project Euler 5 Smallest multiple
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/

//Answer: 232792560


public class ProjectEuler5{
	public static void main(String[] args){

		System.out.println(smallestMultiple(20));
	}

	public static int smallestMultiple(int n){
		boolean status = false;
		int count = 1;
		int result = 0;
		while(status == false){
			result = count * n;
			for(int i = 1; i <= 20; i++){
				if(result % i != 0){
					status = false;
					count++;
					break;
				}
				status = true;
				

			}
		}

		return result;
	}
}