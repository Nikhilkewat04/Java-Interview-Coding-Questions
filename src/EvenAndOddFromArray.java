
public class EvenAndOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6};
		System.out.println("Even Numbers from Array.....");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Numbers From Array......");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
		
		//Using For Each Loop (Enhansing Loop)
		
		System.out.println("Even Numbers From array Using For Each...");
		for(int value :arr) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		
		System.out.println("Odd Numbers from Array Using For  Each...");
		for(int value:arr) {
			if(value%2!=0) {
				System.out.println();
			}
		}
		
	}

}
