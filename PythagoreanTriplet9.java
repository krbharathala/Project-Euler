public class PythagoreanTriplet9{
	public static void main(String[] args){
		for(int i = 3; i<500; i++){
			for(int j = 4; j<=i; j++){
				double k = Math.sqrt((i*i)+(j*j));
				if(k%1 == 0){
					if(i+j+(int)k == 1000){
						System.out.println(i+ ", " +j+ ", "+k+ " sum:" + (i+j+k));
						System.out.println(i*j*k);
					}
				}
			}
		}
	}
}