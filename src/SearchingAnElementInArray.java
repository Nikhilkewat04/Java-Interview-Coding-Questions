
public class SearchingAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,70};
		int element =20;
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(element==arr[i]) {
				System.out.println("Element Found at :"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found.");
		}
		
	}

}
