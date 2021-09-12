import java.util.Scanner;

public class SpiralPrint {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter the row length : ");
        int m = scanner.nextInt();
        
        Scanner scanner1 = new Scanner(System.in);
		 
        System.out.print("Enter the column length : ");
        int n = scanner1.nextInt();
        
		
		int[][] array = new int [m][n];
		int count =1;
		for(int i=0; i< m ; i++) {
			for(int j =0; j< n ; j++) {
			
				array[i][j]= count++; 
				
			}
		}
		
		for(int i=0; i< m ; i++) {
			for(int j =0; j< n ; j++) {
			
				System.out.print(array[i][j]+ "  ");
				
			}
			System.out.println();
		}
		
		System.out.println("Spiral form:");
		System.out.println(); 
		int startRow=0;
		int endRow = m-1;
		int startCol =0;
		int endCol=n-1;
		
		while(startRow <= endCol || startCol <= endCol) {
			
			for(int col =startCol; col <= endCol; col++) {
				System.out.print(array[startRow][col] + " ");
			}
			startRow++;
			
			for(int row =startRow; row <= endRow; row++) {
				System.out.print(array[row][endCol] + " ");
			}
			
			endCol--;
			
			for(int col = endCol; col >= startCol; col--) {
				System.out.print(array[endRow][col] + " ");
			}
			
			endRow--;
			
			for(int row =endRow; row >= startRow; row--) {
				System.out.print(array[row][startCol] + " ");
			}
			
			startCol++;
			
		}	
		
	}

}
