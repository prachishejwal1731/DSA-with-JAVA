import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void improveBubbleSort(int brr[]) {
		int temp = 0;
		// outer loop is number of passes
		for (int i = 0; i < brr.length - 1; i++) {
			for (int j = 0; j < brr.length - 1; j++) {
				// comparing two consecutive elements
				if (brr[j] > brr[j + 1]) {
					temp = brr[j];
					brr[j] = brr[j + 1];
					brr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 8, 7, 1, 4, 6 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		System.out.println();
		System.out.println("Improved bubble sort algorithm : ");

		// Improved bubble sort
		int brr[] = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		System.out.println("Array before sort : " + Arrays.toString(brr));
		improveBubbleSort(brr);
		System.out.println("Array after sort : " + Arrays.toString(brr));
	}

}
