//Cooper Griffin
//Created on April 15 2018

public class ProjectEuler1{
	public static void main(String[] args){
		//Testing
		int sum = 0;

		for(int i = 0; i <= 1000; i++){
			if(i % 3 == 0){
				sum += i;
				System.out.println(i + " Sum = " + sum);
			}else if(i % 5 == 0){
				sum += i;
				System.out.println(i + " Sum = " + sum);
			}
		}
	}
}
