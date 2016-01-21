public class FibonacciNumber25{ //use bigger number next time. It is easier.
	public static void main(String[] args){
		int digits = 2;
		int index = 6;
		int j = 1;
		int index2 = 0;
		/*for(int i = 2; i<1000; i++){
			index = index + 5*i;
			digits = digits + i;
			if(digits>=999){
				index2 = index;
				break;
			}
			index = index + 4;
			digits++;
			if(digits>=999){
				index2 = index;
				break;
			}
		}*/
			
		while(digits<=999){
			j++;
			for(int i = 1; i<=j; i++){
				index = index + 5;
				digits++;
				if(digits>=999){
					index2 = index;
					System.out.println(j);
					break;
				}
			}
			index = index + 4;
			digits++;
		}
		System.out.println(index);
		System.out.println(index2);
	}
}			