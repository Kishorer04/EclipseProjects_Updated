package QA_SDET_Interview;

public class RotateArray {

	// Function to rotate the array
	static void rotate(int arr[], int d, int n) {

		// Storing rotated version of array
		int[] temp = new int[n];

		// Keeping track of the current index of temp[]
		int k = 0;

		// Storing the n-d elements of array arr[] to the front of temp[]
		for (int i = d; i < n; i++) {
			temp[k] = arr[i];
			k++;
		}

		// Storing the first d elements of array arr[] into temp
		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}

		// Copying the elements of temp[] into arr[] to get the final rotated array

		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}

	}

	// Function to print elements of the array
	static void printTheArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int N = arr.length;
		int d = 2;

		rotate(arr, d, N);
		printTheArray(arr, N);

	}

}
