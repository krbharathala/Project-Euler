import java.util.*;
//This is an old program that I retooled for the Lattice Paths problem. I noticed that the number of lattice paths was the middle number
//of the odd rows of Pascal's Triangle. Therefore, the number of lattice paths for a 20x20 matrix is the middle number of the 41st row.

public class LatticePaths15{
	public static void main(String[] args){
		pascalsTriangle();
	}
	
	public static void pascalsTriangle(){
		Scanner console = new Scanner(System.in);
		System.out.println("What row?");
		int row = console.nextInt();
		System.out.println("What column?");
		int column = console.nextInt();
		long[][] arrPascal = new long[92][92];
		arrPascal[0][0] = 1;
		for(int n = 1; n<91; n++){
			long number = 1;
			arrPascal[n][0] = 1;
			for(int r = 0; r<=n; r++){
				number = number * (n-r)/(r+1);
				arrPascal[n][r+1] = number;
			}
			arrPascal[n][n+1] = 1;
		}
		for(int n = 0; n<91; n++){
			for(int r = 0; r<=n; r++){
				if(arrPascal[n][r]> Long.MAX_VALUE || arrPascal[n][r]<0){
					arrPascal[n][r] = 0;
				}
			}
		}
		for(int j = 0; j<=(row+column); j++){
			System.out.println(arrPascal[row+column][j]);
		}
	}
}