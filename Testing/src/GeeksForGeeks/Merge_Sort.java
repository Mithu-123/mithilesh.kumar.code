package GeeksForGeeks;

/**
 *
 * @author mithilesh.kumar
 */
public class Merge_Sort {

	public static void main(String args[]) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };

		mergerSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + " ");
		}

	}

	private static void mergerSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergerSort(arr, start, mid);
			mergerSort(arr, mid + 1, end);
			merge(arr, start, mid, end);

		}

	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int size1, size2;
		size1 = mid - start + 1;
		size2 = end - mid;
		int temp[] = new int[size1];
		int temp2[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			temp[i] = arr[start + i];
		}
		for (int j = 0; j < size2; j++) {
			temp2[j] = arr[mid + 1 + j];
		}

		int i, j, k;
		i = 0;
		j = 0;
		k = start;
		while (i < size1 && j < size2) {
			if (temp[i] < temp2[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp2[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			arr[k] = temp[i];
			i++;
			k++;
		}

		while (j < size2) {
			arr[k] = temp2[j];
			j++;
			k++;
		}

	}

}
