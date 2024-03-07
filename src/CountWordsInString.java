import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str =sc.nextLine(); //Welcome to Java
		int count =1;
		
		
		for(int i =0; i<str.length();i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Total Count Of Words in String is :"+count);
	}

}
