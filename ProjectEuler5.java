public class ProjectEuler5{
	public static void main(String[] args){

	}

	public static int lcmFactorial(int n){
		boolean status = true;
		int count = 0;
		int result = 0;
		while(status == true){
			result = count * n;
			for(int i = 1; i < 20; i++){
				if(result % i != 0){
					break
				}

			}
		}
	}
}