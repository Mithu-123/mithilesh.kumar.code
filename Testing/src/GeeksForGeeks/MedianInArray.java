package GeeksForGeeks;

/**
*
* @author mithilesh.kumar
*/
public class MedianInArray {

    public static void main(String args[]) {
        int[] arr = {1,3,4,2,6,5,8,7};
        int leftSideMax = findMedianElement(arr, arr.length);

        //Print the median if size of array is odd
        if (arr.length % 2 != 0) {
            System.out.println("Median of array element:=>" + arr[arr.length / 2]);
        }

        //Print the median if size of array is even
        if (arr.length % 2 == 0) {
            double median = (float)(arr[arr.length / 2] + leftSideMax) / 2;
            int median_int = (int) median;
            
            //printing  if median is integer
            if (median_int == median) {
                System.out.println("Median of array element:=>" + median_int);
            } else {//printing if median is double 
                System.out.println("Median of array element:=>" + median);
            }

        }
        System.out.println("Printing Arranged Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
    }

    private static int findMedianElement(int[] arr, int length) {
        int i = 0, mid;
        mid = length / 2;
        int max = arr[0];
        //Arranging the Left side of middle element
        for (i = 0; i < length / 2; i++) {
            if (arr[i] > arr[mid]) {
                swap(arr, i, mid);
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (i = length / 2 + 1; i < length; i++) {
            if (arr[mid] > arr[i]) {
                swap(arr, i, mid);
            }
        }
        return max;
    }

    private static void swap(int[] arr, int i, int mid) {
        int temp = arr[i];
        arr[i] = arr[mid];
        arr[mid] = temp;
    }

}

