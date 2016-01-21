public class NumberLetterCount17{
	public static void main(String[] args){
		
/* 		public enum Ones {
			ONE(3), TWO(3), THREE(5), YAHOO(20), ATT(25);
		private int value; }

		public enum Tens { }
		
		 {"one", "two", "three"} = {3, 3, 5}
			 {"eleven", "
			 
 */		
		int[] ones = {3,3,5,4,4,3,5,5,4};
		int[] tens = {3,6,6,8,8,7,7,9,8,8};
		int[] twentytoninety = {6,6,5,5,5,7,6,6};
		int[] hundreds = {0,13,13,15,14,14,13,15,15,14};
		int sum = 0;
		//int sum = 106; //1-19
		
		//sum = sum + 8*sumones(ones) + sumtens(tens) + sumtwentytoninety(twentytoninety);
		for(int i = 0; i<hundreds.length; i++){
			sum = sum + summation(i, ones, tens, twentytoninety, hundreds);
		}
		sum = sum+14; //adding "one thousand" and adding 3 when I subtract it on line 64 for the first iteration.
		sum = sum-30; // subtracting the "and"s from the first number in each hundred. eg "one hundred" instead of "one hundred and".
		System.out.println(sum);
		
	}
	
	public static int sumones(int[] arrayones){ //returns the sum of one-nine.
		int sum = 0;
		for(int i = 0; i<arrayones.length; i++){
			sum = sum + arrayones[i];
		}
		return sum;
	}
	
	public static int sumtens(int[] arraytens){ //return the sum of ten-nineteen
		int sum = 0;
		for(int i = 0; i<arraytens.length; i++){
			sum = sum + arraytens[i];
		}
		return sum;
	}
	
	public static int sumtwentytoninety(int[] arraytwentytoninety){//returns the sum of twenty-ninety
		int sum = 0;
		for(int i = 0; i<arraytwentytoninety.length; i++){
			sum = sum + arraytwentytoninety[i];
		}
		return 10*sum;
	}
	
	public static int sumhundreds(int[] arrayhundreds){ //returns the sum of "one hundred and"-"nine hundred and"
		int sum = 0;
		for(int i = 0; i<arrayhundreds.length; i++){
			sum = sum + arrayhundreds[i];
		}
		return 10*sum;
	}
	
	public static int summation(int j, int[] array1, int[] array2, int[] array3, int[] array4){
		int sum = 0;
		//sum = sum + array4[j]-3;
		sum = sum + 9*sumones(array1) + sumtens(array2) + sumtwentytoninety(array3) + sumhundreds(array4);
		return sum;
	}
}