
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,5};
		int sum =0;
//		for (int i =0;i<=arr.length-1;i++) {
//			sum+=arr[i];
//		}
		
		//Approach 2- Using for each
		for(int value : arr) {
			sum+=value;
		}
		System.out.println("Sum Of Array is :"+sum);
		
	}

}
