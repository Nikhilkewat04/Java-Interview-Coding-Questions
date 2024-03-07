
public class RemoveSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My Name Is Nikhil Shrikrushna Kewatkar";
		
		System.out.println("String Before Removing Spaces :"+str);
		str = str.replaceAll("\\s", "");
		System.out.println("String After Removing Spaces :"+str);

	}

}
