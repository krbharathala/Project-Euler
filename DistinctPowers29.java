import java.util.*;
import java.math.BigDecimal;
public class DistinctPowers29{
	public static void main(String[] args){
		final long startTime = System.currentTimeMillis();
		HashSet before = new HashSet();
		for(double i = 2;i<=100; i++){
			for(double j = 2; j<=100; j++){
				before.add(new BigDecimal(Math.pow(i,j)));
			}
		}
		System.out.println(before.size());
		/*int a = 0;
		HashMap before = new HashMap();
		for(double i = 2;i<=100; i++){
			for(double j = 2; j<=100; j++){
				a++;
				BigDecimal number = new BigDecimal(Math.pow(i,j));
				before.put(a,number);
			}
		}
		System.out.println(before.size());*/
		/*ArrayList powers = new ArrayList();
		for(double i = 2;i<=100; i++){
			for(double j = 2; j<=100; j++){
				BigDecimal number = new BigDecimal(Math.pow(i,j));
				if(powers.contains(number) == false){
					powers.add(number);
				}
			}
		}
		System.out.println(powers.size());*/
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime));
	}
}		