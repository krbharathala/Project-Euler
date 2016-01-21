public class Prime7{
	public static void main(String[] args){
		int count = 0;
		int i = 1;
		while(count<=10001){
			i++;
			if(isPrime(i)){
				count++;
			}
		}
		System.out.println(i);
	}
	
	public static boolean isPrime(int j){
		boolean prime = true;
		for(int k = 2; k<j; k++){
			if(j%k == 0){
				prime = false;
			}
		}
		return prime;
	}
}