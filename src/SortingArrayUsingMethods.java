import java.util.Arrays;
import java.util.Collections;

public class SortingArrayUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach 1
		/*
		int arr[] = {60,40,10,30,20,50};
		System.out.println("Array Elements Before Sorting"+Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Array Elements After Sorting"+Arrays.toString(arr));
		*/
		//Approach 2 
		/*
		int arr[] = {60,40,10,30,20,50};
		System.out.println("Array Elements Before Sorting"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array Elements After Sorting"+Arrays.toString(arr));
		*/
		
		//Approach 3
		Integer arr[] = {60,40,10,30,20,50};
		System.out.println("Array Elements Before Sorting"+Arrays.toString(arr));
		Arrays.sort(arr ,Collections.reverseOrder());
		System.out.println("Array Elements After Reverse Sorting"+Arrays.toString(arr));
	}

}
