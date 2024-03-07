import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A string");
		String str =sc.next();
		String ori_str =str;
		String rev ="";
		int len =str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		if(ori_str.equals(rev)) {
			System.out.println("String is Palindrome..."+ori_str);
		}
		else {
			System.out.println("String is not Palindrome..."+ori_str);
		}
		
	}

}
