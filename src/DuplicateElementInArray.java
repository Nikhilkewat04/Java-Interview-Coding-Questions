import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"java","c","c#","python","java"};
		
		//Approach 1- Using for loop
//		boolean flag =false;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate Element is :"+arr[j]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("Duplicate Element Not Found :");
//		}
		
		HashSet<String> hs =new HashSet<>();
		
		/*System.out.println(hs.add("JAVA"));
		System.out.println(hs.add("PYTHON"));
		System.out.println(hs.add("JAVA"));
		*/
		
		boolean flag =false;
		for(String l :arr) {
			if(hs.add(l)==false) {
				System.out.println("Duplicate Element Found :"+l);
				flag=true;
			}
		}
		if(flag!=true) {
			System.out.println("Duplicate Element Not found...");
		}
		
	}

}
