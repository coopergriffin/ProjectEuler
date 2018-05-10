//Cooper Griffin
//April 15 2018 
//Project Euler 7 10001st Prime
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/

//Answer: 104743

public class ProjectEuler7{
	
	public static void main(String[] args){

		findPrime(Integer.parseInt(args[0]));

	}

	public static void findPrime(long n){

		int count = 0;
		boolean isPrime = false;

		for(long i = 2; count < n; i++){
			//System.out.println(i);
			isPrime = true;

			if(i % 2 == 0 && i != 2){

				isPrime = false;

			}else{

				for(int x = 3; x <= i/2; x++){

					if(i % x == 0){

						isPrime = false;
						break;

					}
				}
			}

			if(isPrime == true){

				System.out.println("The " + (count + 1) + "-th prime number is: " + i );
				count++;

			}
		}
	}
}