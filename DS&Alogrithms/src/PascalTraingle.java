import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTraingle {
	
	
	// time complexity O(n^3)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
		
		List<List<Integer>> lst=  Pascal(n);
		
		 for(int i =0; i< lst.size(); i++) {
			 
			 for(int k=0; k < lst.get(i).size() ; k++) {
				 
				 System.out.print(lst.get(i).get(k) + " ");
			 }
			 
			 System.out.println();
		 }

            
	}

	private static List<List<Integer>> Pascal(int n) {
		
		// TODO Auto-generated method stub
		
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i =0; i < n ; i++) {
		 ArrayList<Integer> lst=	new ArrayList<Integer>();
		 
		 for (int j = 0; j <= i; j++) {
			 
			 lst.add(binomialCoefficient(i,j));
		 }
		 list.add(lst);
		}
		
		return list;
		
	}

	private static Integer binomialCoefficient(int i, int j) {
		// TODO Auto-generated method stub
		//return null;
		int res=1;
		if(j > i-j)
			j = i-j;
		
		for(int k =0; k < j ; k++)
		{
			res *= (i-k);
			res /= (j-k);
		}
		return res;
	}

}
