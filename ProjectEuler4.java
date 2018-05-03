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