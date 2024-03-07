
public class CountEvenOrOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num =1234565;
			int eCount =0;
			int oCount=0;
			
			while(num>0) {
				int rem =num%10;
				if(rem%2==0) {
				eCount++;
				}else {
					oCount++;
				}
				num/=10;
			}
			System.out.println("Even Count is :"+eCount);
			
			System.out.println("Odd Count is :"+oCount);
	}

}
 