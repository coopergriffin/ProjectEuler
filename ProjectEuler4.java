//Cooper Griffin
//April 15th 2018
//Project Euler 2 Largest Palindrome Product 
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

//Answer: 906609

public class ProjectEuler4{
	public static void main(String[] args){
		int[] x = productTwoThreeDigits();
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[0] * x[1]);

	}

	public static int[] productTwoThreeDigits(){
		long largest = 0;
		int[] numbers = {0, 0};
		for(int x = 0; x < 1000; x++){
			for(int y = 0; y < 1000; y++){
				if(x * y > largest && isPalindrome(x * y)){
					largest = x*y;
					numbers[0] = x;
					numbers[1] = y;
				}

			}
		}

		return numbers;
	}

	public static boolean isPalindrome(long n){
		String x = String.valueOf(n);

		for(int i = 0; i < x.length()/2; i++){
			if(x.charAt(i) != x.charAt(x.length() - 1 - i )) {
				return false;
			}
		}
		System.out.println(x);
		return true;
	}
}