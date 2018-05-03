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