import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to reverse :");
		int num = sc.nextInt();
		
		//LOGIC - 1 Using algorithm 
		
//		int rev =0;
//		while(num !=0) {
//			rev = rev*10 + num%10;
//			num = num/10;
//			
//		}
		
		//LOGIC -2 Using StringBuffer method
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev =sb.reverse();
//		
		 //LOGIC 3 Using StringBuildler
		
		StringBuilder sbl = new StringBuilder();
		
		sbl.append(num);
		StringBuilder rev =sbl.reverse();
		
		System.out.println("Number after reversing :"+rev);

		
	}

}
