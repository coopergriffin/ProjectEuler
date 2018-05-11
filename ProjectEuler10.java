//Cooper Griffin
//May 10th 2018
//Project Euler 10 Summation of primes
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/

//Answer: 142913828922

public class ProjectEuler10{
	public static void main(String[] args){
		System.out.println(primeSummation());
	}

	public static long primeSummation(){
		long sum = 0l;
		for(long i = 2l; i < 2000000; i++){
			//System.out.println(i);
			if(isPrime(i)){
				System.out.println(i);
				sum += i;
			}
		}

		return sum;
	}

	public static boolean isPrime(long n){
		for(long i = 2l; i <= Math.sqrt(n); i++){
			//System.out.println(n + " % " + i + " = " + n % i);
			if(n % i == 0){
				
				//System.out.println(false);
				return false;
			}
		}
		//System.out.println(true);
		return true;
	}

}