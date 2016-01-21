public class SumSquareDifference6{
	public static void main(String[] args){
		int a = sumOfSquare(100);
		int b = squareofSum (100);
		System.out.println(b-a);
	}
	
	public static int sumOfSquare(int c){
		int count = 0;
		for(int i = 1; i<=c; i++){
			count = count + i*i;
		}
		return count;
	}
	
	public static int squareofSum(int d){
		int count = 0;
		for(int i = 1; i<=d; i++){
			count = count + i;
		}
		int e = count*count;
		return e;
	}
}