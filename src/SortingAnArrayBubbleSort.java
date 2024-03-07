import java.util.Arrays;

public class SortingAnArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,6,5,4,3,2,1};
		System.out.println("Array Before Sorting :"+Arrays.toString(arr));
		int n =arr.length;
		for(int i=0;i<n-1;i++) //Number Of Passes
			{
			for(int j=0;j<n-1;j++) //Iteration in Each Pass
			{
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting :"+Arrays.toString(arr));
	}

}
