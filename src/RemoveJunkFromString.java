
public class RemoveJunkFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "~!@#$%^&*><~!@#$%^ NIKHIL 00987654354321";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
	}

}
