import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number :"); 
//		int num = sc.nextInt();
		int num =1234567;
		int count =0;
		while(num>0) {
			num/=10; 
			count++;
		}
		
		System.out.println("Number of Count: "+count);
	}

}
