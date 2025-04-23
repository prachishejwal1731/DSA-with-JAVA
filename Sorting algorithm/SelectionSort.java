import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("Array after pass :"+i+" and array is :"+Arrays.toString(arr));
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {52,10,32,12,34,2,5,7};
		System.out.println("Before sorting : "+Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
	}

}
