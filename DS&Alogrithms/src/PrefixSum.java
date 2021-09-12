
public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {-2,3,4,-1,5,-12,6,1,3};
		
		 System.out.println(CalculatePrefixSum(array, array.length));
	}
	
	
	// compute maximum sub array sum using O(N^2)
	private static int CalculatePrefixSum(int[] array, int length) {
		
		int[] prefixSum = new int[length];
		prefixSum[0]= array[0];
		
		for(int i=1; i< length ; i++) 
			prefixSum[i] = prefixSum[i-1] + array[i];
		
		int maximumSum =0;
		
		for(int i=0; i< length ; i++) {
			for (int j = i; j< length ; j++) {
				
				int localSum = (i > 0) ? (prefixSum[j]- prefixSum[i-1]) : prefixSum[j];  
				
				maximumSum = Math.max(maximumSum, localSum);
			}
			
		}
		return maximumSum;
	}

}
