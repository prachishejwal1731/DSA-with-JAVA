import java.util.Arrays;

public class InsertionSort {
	// insertion sort
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j, temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	// insertion technique for last element is unsorted
	public static void insertionTechnique(int brr[]) {
		int temp = brr[brr.length - 1];
		int j;
		System.out.println(temp);
		for (j = brr.length - 2; j >= 0 && brr[j] > temp; j--) {
			brr[j + 1] = brr[j];
		}
		brr[j + 1] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 9, 6, 4, 5, 3, 13 };
		insertionSort(arr);
		System.out.println("After Sorting" + Arrays.toString(arr));
		int brr[] = { 5, 6, 7, 9, 1 };
		insertionTechnique(brr);
		System.out.println("After InsertionTechnique" + Arrays.toString(brr));
	}

}
