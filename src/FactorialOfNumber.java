
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		long factorial = 1;
		
		//Using Increasing loop 
//		for(int i =1; i<=num;i++) {
//			factorial =factorial*i;
//		}
//		System.out.println("Factorial Of a Number using increasing  is :"+factorial);
//	
		//Using Decreasing Loop
		for(int i =num; i>=1;i--) {
			factorial*=i;
		}
		System.out.println("Factorial of a Number Using Decreasing Loop is :"+factorial);
	
	}
	
}
