import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,10,11,19,29,28};
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the key:");
		int key = myObj.nextInt();
		int index=BinarySearchRecursive(array, key,0,array.length-1);
		int iterativeIndex = BinarySearchIterative(array, key, array.length-1);
		 if( index != -1 )
			 System.out.println("Element found at index : " +  index);
		 else
			 System.out.println("Element not found");
		 
		 if( iterativeIndex != -1 )
			 System.out.println("Element found at index : " +  iterativeIndex);
		 else
			 System.out.println("Element not found");
		
	}

	private static int BinarySearchIterative(int[] array, int key,int len) {
		int start = 0;
		int end = len;
		int mid;
		
		while(start <= end) {
			
			mid= (start + end)/2;
			
			if (key > array[mid])
				start = mid +1;
			else if (key < array[mid])
				end = mid -1;
			else 
				return mid;

		}
		return -1;
	}

	private static int BinarySearchRecursive(int[] array, int key,int start, int end) {
		
		if(start > end) return -1;
		int mid = (start+ end)/2;
		
		if(key> array[mid])
				return BinarySearchRecursive(array,key, mid+1, end);
		else if(key < array[mid])
				 return BinarySearchRecursive(array, key, start, mid-1);
		else
			return mid;
	}

}
