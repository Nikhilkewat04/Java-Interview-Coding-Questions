
public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="java Programming java oops"; //Find a 
		
		int total_count =str.length(); // Total Length
		int after_remove_count =str.replace("a", "").length(); //total count after remove a for String
		
		int a_count =total_count-after_remove_count;
		System.out.println("Number of occurance of a is :"+a_count);
		
	}

}
