
public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {-2,3,4,-1,5,-12,6,1,3};
		
		 System.out.println(maxConsecutiveSum(array, array.length));
	}

	// time complexity using kadane algorithm is O(N)
	private static int maxConsecutiveSum(int[] array, int length) {
		
		int localMax = 0;
		int globalMax = array[0];
		
		for(int i=0; i< length ; i++) {
			
			localMax = Math.max(array[i], array[i] + localMax);
			globalMax = Math.max(localMax, globalMax);
		}
		return globalMax;
	}

}
