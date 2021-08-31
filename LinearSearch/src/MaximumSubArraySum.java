
public class MaximumSubArraySum {

	public static void main(String[] args) {
		// brute force approach
		int[] array = new int[] {-2,3,4,-1,5,-12,6,1,3};
		
		int maximumSum =LargestSubArraySum(array);
		System.out.println("maximum sum of sub array is :" + maximumSum);
	}

	
	// Time complexity for this code is O(n^3)
	private static int LargestSubArraySum(int[] array) {
		int maximumSum=0;
		for(int i=0; i< array.length; i++) {
			for(int j=i; j < array.length; j++) {
				
				int sum=0;
				for(int k=i; k<= j; k++) 
					sum += array[k];
				
				maximumSum=Math.max(maximumSum, sum);
			} 
		}
		return maximumSum;
	}

}
