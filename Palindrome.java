public class Palindrome{
	public static void main(String[] args){
		int count = 0;
		int[] arr = new int[10100];
		for(int i = 900; i<1000; i++){
			for(int j =900; j<1000; j++){
				count++;
				arr[count] = i*j;
			}
		}
		/*int[] palarr = new int[10100];
		for(int i=0; i<arr.length; i++){
			String pal = integer.toString(arr[i]);
			if(isPalindrome(arr[i] == True)
			// work on
		}*/
		int[] palarr2 = new int[10100];
		palarr2 = isPalindrome(arr);
		for(int i = 0; i<arr.length; i++){
			System.out.print(palarr2[i]+" ");
		}
	}
	
	public static int[] isPalindrome(int[] array){
		int count = 0;
		int[] palarr = new int[10100];
		for(int i=0; i<array.length; i++){
			String pal = Integer.toString(array[i]);
			//for(int i = 0; i<pal.length(); i++){
			if(pal.length()>2){
				if(pal.charAt(0) == pal.charAt(pal.length()-1) && pal.charAt(1) == pal.charAt(pal.length()-2)){
					count++;
					palarr[count] = array[i];
				}
			}
		}
		return palarr;
	}
}
			