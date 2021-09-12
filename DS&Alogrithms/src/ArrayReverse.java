
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {10,20,30,45,60,80,90,100,110};
		int len = array.length-1;
		
		int mid = len/2;
		for(int i=0; i<= mid; i++) {
			
			int temp = array[len -i];
			array[len-i]= array[i];
			array[i]= temp;
			
		}
		
		for(int i=0;i<=len;i++)
			System.out.print(array[i] + ",");
	}

}
