public class DivisibleTriangular12{
	public static void main(String[] args){
		int result = 0;
		int number = 0;
		int divisors = 0;
		while(divisors<500){
			number++;
			divisors = 1;
			result = result + number;
			for(int i = 1; i<=result/2; i++){
				if(result%i ==0){
					divisors++;
				}
			}
			System.out.println(result);
		}
	}
}