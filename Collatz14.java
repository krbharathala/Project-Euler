public class Collatz14{
	public static void main(String[] args){
		long max = 0;
		int i = 800001;
		long count = 0;
		long j = 0;
		long[] array = new long[1000001];
		while(i<1000000){
			i=i+2;
			j = i;
			count = 0;
			while(j!=1){
				if(j%2 ==0){
					j=j/2;
				}
				else{
					j = (3*j)+1;
				}
				count++;
			}
			array[i-1] = count;
			if(count>max){
				max = count;
			}
			System.out.println(i);
		}
		for(int k=0; k<array.length; k++){
			if(array[k] == max){
				System.out.println(k+1);
			}
		}
	}
}