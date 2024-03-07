
public class MinAndMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {50,40,100,60,70,120};
		int max =arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max Element in Array is :"+max);

		int min =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min Element in Array is :"+min);
	}

}
