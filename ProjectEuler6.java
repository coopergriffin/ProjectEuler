//Cooper Griffin
//April 15th 2018
//Project Euler 6 Sum Square Difference
/*The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum*/

//Answer: 25164150


public class ProjectEuler6{

	public static void main(String[] args){
		System.out.println(difference(squareOfTheSum(100), sumOfSquares(100)));
	}

	public static long sumOfSquares(int n){
		long sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i*i;
		}

		return sum;
	}

	public static long squareOfTheSum(int n){
		long sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
		}

		return sum * sum;
	}

	public static long difference(long x, long y){
		return x - y;
	}

}