
public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int key =5;
		boolean flag =false;
		int l =0;
		int h =arr.length-1;
		
		while(l<=h) {
			int m=l+h/2;
			
			if(arr[m]==key) {
				System.out.println("Element Found...");
				flag=true;
				break;
			}
			if(arr[m]<key) {
				l=m+1;
			}
			if(arr[m]>key) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found.");
		}
	}

}
