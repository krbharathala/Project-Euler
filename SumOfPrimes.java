public class SumOfPrimes{
	public static void main(String[] args){
		long count = 0;
		int i = 1;
		while(i<2000000){
			i++;
			if(isPrime(i)== true){
				//System.out.println(i);
				count = count + i;
			}
		}
		System.out.println(count);
	}
		
	public static boolean isPrime(int j){
		boolean prime = true;
		for(int k = 2; k <j; k++){
			if(j%k == 0){
				prime = false;
				break;
			}
		}
		return prime;
	}
}