import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void quickSort(int arr[], int left, int right) {
		// 0. If partition has single element or invalid partition, return
		if (left >= right) {
			return;
		}
		// Consider left element as pivot element
		int pivot = arr[left];
		int i = left + 1;
		int j = right;

		while (i <= j) {
			// 1. From left (i index) try to find element greater than pivot
			while (i <= j && arr[i] <= pivot) {
				i++;
			}
			// 2. From right (j index) try to find element smaller or equal to pivot
			while (i <= j && arr[j] > pivot) {
				j--;
			}
			// 3. If i < j, Swap i^th element with j^th element
			if (i < j) {
				swap(arr, i, j);
			}
		}
		// 4. Swap the j^th element with pivot element
		swap(arr, left, j);

		// 5. Apply Quick sort to left partition (left to j-1)
		quickSort(arr, left, j - 1);
		// 6. Apply Quick sort to right partition (j+1 to right)
		quickSort(arr, j + 1, right);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of array : ");
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element at index of array : " + i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.println("Elements of array are : " + Arrays.toString(arr));

		int left = 0;
		int right = arr.length - 1;
		System.out.println("before sort: " + Arrays.toString(arr));
		quickSort(arr, left, right);
		System.out.println("After sort: " + Arrays.toString(arr));
	}
}
