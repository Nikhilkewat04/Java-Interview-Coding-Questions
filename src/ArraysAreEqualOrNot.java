import java.util.Arrays;

public class ArraysAreEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		//Approach 1 - using equals method
		
//		boolean result = Arrays.equals(a1, a2);
//		
//		if(result) {
//			System.out.println("Arrays Are Equal...");
//		}
//		else {
//			System.out.println("Arrays are not eqaul...");
//		}
		
		//Using if else 
		
		boolean status =true;
		if(a1.length==a2.length) {
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i]) {
				status=false;
			}
		}
		}
		else {
			status =false;
		}
		
		if(status) {
			System.out.println("Arrays are similar...");
		}
		else {
			System.out.println("Arrays are Different...");
		}
		
	}

}
