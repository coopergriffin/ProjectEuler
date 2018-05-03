public class ProjectEuler2{
	public static void main(String[] args){
		run();
	}

	/*public static int fibonnaci(int n){
		if(n == 0){
			return 0;
		}
		else if(n ==1){
			return 1;
		}else{
			return fibonnaci(n-1) + fibonnaci(n-2);
		}
	}*/

	public static long fibonnaci(long limit){
		long x = 0;

		long y = 1;
		long z = 0;
		long sum = 0;

		while(x < limit){
			
			x = y + z;
			if(x % 2 == 0){
				sum += x;
				System.out.println(x);
			}
			z = y; 
			y = x;
		}

		return sum;
	}

	public static void run(){
		long sum = 0;
		//long result = 0;
		/*for(int i = 0; result < 4000000000L; i++){
			result = fibonnaci(i);
			if(result % 2 == 0){
				System.out.println(result);
				sum += result;
			}
		}*/
		sum = fibonnaci(4000000L);
		System.out.println("Sum = " + sum);
	}
}