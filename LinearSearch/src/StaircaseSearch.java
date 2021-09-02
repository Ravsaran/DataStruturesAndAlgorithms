import java.util.Scanner;

public class StaircaseSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		 Scanner scanner2 = new Scanner(System.in);		 
	     System.out.print("Enter the key value: ");
	     int key = scanner2.nextInt();
	      
	     int[] arr =StairSearch(array,m,n,key); 
	     if(arr != null)
	    	 System.out.println("element found at row index:" + arr[0] + 
    				 " and column index:" + arr[1]);
	     else 
	    	 System.out.println("Element not found");
		
	}

	// done using O(n+m) time complexity
	private static int[] StairSearch(int[][] array, int m, int n, int key) {
		// TODO Auto-generated method stub
		int col= n-1;
	    int row = 0;
	     while(col >= 0 && row < m) {  	 
	    	 if(array[row][col] > key) col--;		 	
	    	 else if(array[row][col] < key) row++;
	    	 else return new int[] { row,col};   	 
	     }
	     return null;  
	}

}
