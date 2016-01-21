import java.util.*;
import java.io.*;
// I took out the commas and quotation marks and added spaces between the names in the file.
public class NamesScores22{
	public static void main(String[] args)throws FileNotFoundException{
		File f = new File("p022_names.txt");
		Scanner input = new Scanner(f);
		ArrayList<String> names1 = new ArrayList<String>();
		while(input.hasNext()){
			names1.add(input.next());
		}
		Collections.sort(names1); //sorts the arraylist alaphabetically
		String[] names = names1.toArray(new String[names1.size()]);
		long sum = 0;
		for(int i = 0; i<names.length; i++){
			sum = sum + (i+1)*lettersum(i, names);
		}
		System.out.println(sum);
	}
	
	public static int lettersum(int i, String[] names){
		int sum = 0;
		for(int j=0; j<names[i].length(); j++){
			if(names[i].charAt(j) == 'A'){
				sum = sum + 1;
			}
			if(names[i].charAt(j) == 'B'){
				sum = sum + 2;
			}
			if(names[i].charAt(j) == 'C'){
				sum = sum + 3;
			}
			if(names[i].charAt(j) == 'D'){
				sum = sum + 4;
			}
			if(names[i].charAt(j) == 'E'){
				sum = sum + 5;
			}
			if(names[i].charAt(j) == 'F'){
				sum = sum + 6;
			}
			if(names[i].charAt(j) == 'G'){
				sum = sum + 7;
			}
			if(names[i].charAt(j) == 'H'){
				sum = sum + 8;
			}
			if(names[i].charAt(j) == 'I'){
				sum = sum + 9;
			}
			if(names[i].charAt(j) == 'J'){
				sum = sum + 10;
			}
			if(names[i].charAt(j) == 'K'){
				sum = sum + 11;
			}
			if(names[i].charAt(j) == 'L'){
				sum = sum + 12;
			}
			if(names[i].charAt(j) == 'M'){
				sum = sum + 13;
			}
			if(names[i].charAt(j) == 'N'){
				sum = sum + 14;
			}
			if(names[i].charAt(j) == 'O'){
				sum = sum + 15;
			}
			if(names[i].charAt(j) == 'P'){
				sum = sum + 16;
			}
			if(names[i].charAt(j) == 'Q'){
				sum = sum + 17;
			}
			if(names[i].charAt(j) == 'R'){
				sum = sum + 18;
			}
			if(names[i].charAt(j) == 'S'){
				sum = sum + 19;
			}
			if(names[i].charAt(j) == 'T'){
				sum = sum + 20;
			}
			if(names[i].charAt(j) == 'U'){
				sum = sum + 21;
			}
			if(names[i].charAt(j) == 'V'){
				sum = sum + 22;
			}
			if(names[i].charAt(j) == 'W'){
				sum = sum + 23;
			}
			if(names[i].charAt(j) == 'X'){
				sum = sum + 24;
			}
			if(names[i].charAt(j) == 'Y'){
				sum = sum + 25;
			}
			if(names[i].charAt(j) == 'Z'){
				sum = sum + 26;
			}
		}
		return sum;
	}
}