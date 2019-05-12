package GeeksForGeeks;

/**
 *
 * @author mithilesh.kumar
 */
public class QuickSort {

	public static void main(String args[]) {

		int[] arr = { 10, 6, 4, 8, 12, -5 };
		qucikSort(arr, 0, arr.length - 1);

		for (int j = 0; j < arr.length; j++) {
			System.out.print(" ->" + arr[j]);
		}

	}

	private static void qucikSort(int[] arr, int low, int high) {
		int pi;

		if (low < high) {

			pi = partition(arr, low, high);
			qucikSort(arr, low, pi - 1);
			qucikSort(arr, pi + 1, high);
		}
	}

	private static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
