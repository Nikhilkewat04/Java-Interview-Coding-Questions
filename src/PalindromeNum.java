import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		int ori_num =num;
		int rev =0;
		
		while(num!=0) {
			rev=rev*10 +num%10;
			num=num/10;
		}
		if(ori_num==rev){
		System.out.println(ori_num+" Number is Palindrome!!!!");
		}
		else{
			System.out.println(ori_num+" Number is not  Palindrome!!!!");
		}
	}

}
