package SearchingAlgo;

import java.util.Arrays;
import java.util.Scanner; 

public class BinarySearch {
	public static int  binarySearch(int[] brr,int key) {
		int start=0;
		   int end=brr.length;
	   for(int i=0;i<brr.length;i++) {
		   
		   int mid=(start+end)/2;
		   
		   if(key==brr[mid]) {
			   return mid;
		   }else if(key<brr[mid]) {
			   end=mid-1;
		   }else {
			   start=mid+1;
		   }
	   }
	   return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {11,22,33,44,55,66};
        System.out.println("Enter a key to Search : ");
        int key=sc.nextInt();
		System.out.println("Before Sorting - "+Arrays.toString(arr));
		int index=binarySearch(arr,key);
		if (index==-1) {
			System.out.println("Element not found in array");
		}else {
			System.out.println("Element found at index - "+index);
		}
	}

}