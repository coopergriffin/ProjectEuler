import java.util.*;

public class ProjectEuler3{

	public static void main(String[] args){
		//System.out.println(isPrime(10l));
		System.out.println(arrayListOfFactors(600851475143l));
		System.out.println(largestPrimeInArray(arrayListOfFactors(600851475143l)));
		
	}

	public static boolean isPrime(long n){
		for(long i = 2l; i < n; i++){
			//System.out.println(n + " % " + i + " = " + n % i);
			if(n % i == 0){
				
				//System.out.println(false);
				return false;
			}
		}
		//System.out.println(true);
		return true;
	}

	public static List<Long> arrayListOfFactors(long n){
		List<Long> factors = new ArrayList<>();

		for(long i = 2l; i < Math.sqrt(n); i++){
			//System.out.println(i);
			if(n % i == 0){
				factors.add(i);
			}
		}

		int size = factors.size();

		for(int x = 0; x < size; x++){
			//System.out.println((n/ factors.get(x)) + "!!! ");
			factors.add(n/factors.get(x));
		}

		return factors;
		
	}

	public static long largestPrimeInArray(List<Long> n){
		long largestPrime = 1;
		for(Long l: n){
			//System.out.println(l + "!");
			if(isPrime(l)){
				largestPrime = l;
			}
		}

		//System.out.println(largestPrime + "!!");
		return largestPrime;
	}

}