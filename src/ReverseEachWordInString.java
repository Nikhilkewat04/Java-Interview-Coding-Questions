 
public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach -1 
		/*
		String str ="welcome to java";  //Original String
		String words[] = str.split(" "); //Splitting the String
		
		String reverse_Str ="";
		
		for(String w : words) {
			String reverseword ="";
			for(int i=w.length()-1;i>=0;i--) {
				reverseword+=w.charAt(i);
			}
			reverse_Str+=reverseword+" ";
		}
		System.out.println(reverse_Str);
		*/
		
		//Approach 2 -Using StringBuilder
		String str ="welcome to java";
		String words[] = str.split("\\s");
		String reverseWord ="";
		
		for(String w:words) {
			StringBuilder sb =new StringBuilder(w);
			sb.reverse();
			reverseWord+=sb.toString()+" ";
		}
		System.out.println(reverseWord);
		
	}

}
