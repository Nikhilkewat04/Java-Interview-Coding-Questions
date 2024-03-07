

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "NIKHIL";
		String rev= "";
		
		//LOGIC -1 Using String Concatenation operator
		
//		int len = str.length();
//		
//		for(int i=len-1; i>=0;i--){
//			rev+=str.charAt(i);
//		}
//		
//		System.out.println("Reversed String is :"+rev);
		
		//LOGIC -2 Using Char array
		
//		char[] ch = str.toCharArray();
//		int len = ch.length;
//		for(int i =len-1;i>=0;i--) {
//			rev+=ch[i];
//			
//		}
//		System.out.println("Reversed String is :"+rev);
		
		//LOGIC 3- USing String Buffer 
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
