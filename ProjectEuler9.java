//Cooper Griffin
//May 10th 2018
//Project Euler 9 Special Pythagorean Triplet 
/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

//Answer: 31875000

public class ProjectEuler9{
	public static void main(String[] args){
		System.out.println(pythagoreanTripletsProduct());
	}

	public static int pythagoreanTripletsProduct(){
		for(int a = 1; a < 1000; a++){
			for(int b = 1; b < 1000; b++){
				for(int c = 1; c < 1000; c++){
					if(a*a + b*b == c*c && a + b + c == 1000){
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
						System.out.println(a*a + b*b + c*c);
						return a*b*c;
					}
				}
			}
		}

		return 0;
	}
}