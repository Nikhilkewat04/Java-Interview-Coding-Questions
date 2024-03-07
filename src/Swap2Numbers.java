
public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10, b= 20;
		
		System.out.println("Before Swapping Values are: "+a+" "+b);
		
		//LOGIC 1 - Using Third Variable
			
			/*
			int temp = a;
  			a= b;
			b =temp;*/
			
		//LOGIC 2 - Without Using Third Variable
			/*
			a=a+b; //10+20=30
			b=a-b;	//30-20 =10
			a=a-b;  //30-10 =20
		*/
		
		//LOGIC 3 - use * and / without using Third variable 
		//Remember that here a and b value should not be 0 (zero)
		
		/*
		 a=a*b; //10*20=200
		 b=a/b; //200/20=10
		 a=a/b; //200/10 =20
		 */
		
		
		//LOGIC 4 - use Bitwise XOR (^) operator
		/*
		a=a^b; //10^20=30
		 b=a^b; //30^20 =10
		 a=a^b; //30^10=20 
		 */
		
		//LOGIC 5 - using single statement
		 b=a+b-(a=b);
		
		 System.out.println("atfer Swapping Values are: "+a+" "+b);
			
		

	}

}
