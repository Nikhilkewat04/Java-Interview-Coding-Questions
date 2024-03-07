import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		System.out.println("Enter Third Number :");
		int c =sc.nextInt();
		
		//LOGIC - 1 Using if Else ladder 
//		if(a>b && a>c) {
//			System.out.println("First Number is Largest :"+a);
//		}
//		else if(b>c) {
//			System.out.println("Second Number is Largest :"+b);
//		}
//		else {
//			System.out.println("Third is Largest :"+c);
//		}
//		
		
		//LOGIC 2 Using Ternary Operator(Conditional Operator)
		
//		int res =(a>b)?a:b;
//		int largest =(res>c)?res:c;
//		System.out.println("Largest number is :"+largest);
		
		int largest =(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Largest Number is :"+largest);
	}

}
