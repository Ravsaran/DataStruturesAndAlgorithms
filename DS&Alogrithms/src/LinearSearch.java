
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,0,10,11,9,8,8,7};
		int key = 8;
		if(linearSearch(arr,key)) 
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}

	private static boolean linearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i< arr.length;i++) {
			if(arr[i] == key) return true;			
		}
		return false;
	}
}
