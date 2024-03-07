
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5};
		
		int sum1=0;
		for(int i =0;i<arr.length;i++) {
			sum1+=arr[i];
		}
		System.out.println("Sum Of Array Elements are :"+sum1);
		
		int sum2=0;
		for (int i=1;i<=5;i++){
			sum2+=i;
		}
		System.out.println("Sum of Range of Elements in array :"+sum2);
		
		System.out.println("The Missing Number in Array is :"+(sum2-sum1));
	}

}
