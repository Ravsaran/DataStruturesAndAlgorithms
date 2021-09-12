
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {10,20,30,40,50,60};
		
		PrintSubArray(array);
		
	}

	
	private static void PrintSubArray(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=0; i< array.length; i++) {
			for(int j=i; j < array.length; j++) {
				
				for(int k=i; k<= j; k++) {
					
					System.out.print(array[k] + " ");
				}
				System.out.println();
			}
		}
	}

}
