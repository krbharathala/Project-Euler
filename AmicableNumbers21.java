public class AmicableNumbers21{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 2; i<=10000; i=i+2){
			sum = sum + isamicable(i);
		}
		System.out.println(sum);
	}
	
	public static int factorsum(int j){
		int sum = 0;
		for(int k = 1; k<j; k++){
			if(j%k == 0){
				sum = sum+k;
			}
		}
		return sum;
	}
	
	public static int isamicable(int a){
		int b = factorsum(a);
		if(a ==b){
			return 0;
		}
		else{
			if(factorsum(b) == a){
				return a;
			}
			else{
				return 0;
			}
		}
	}
}