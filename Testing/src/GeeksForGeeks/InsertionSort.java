package GeeksForGeeks;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 9, 2, 4, 8, 3 ,-3,-4,34};
		int key = 0, j, i;
		int temp=0;
		//Insertion sort
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && (arr[j] > key)) {
				temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;			
				j--;
			}
			

		}

		//Printing Sorted Array
		for( i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}

}
