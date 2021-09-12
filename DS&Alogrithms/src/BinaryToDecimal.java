import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter an String : ");
        String str = scanner.nextLine();
        
       int base =1;
       int sum=0;
        for (int i = str.length()-1; i >= 0  ; i--) {
        		if (str.charAt(i) == '1')
        				sum = sum + base;
        		base = base*2;	
        }
        
        
        System.out.println(sum);
	}

}
