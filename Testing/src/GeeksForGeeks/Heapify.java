package GeeksForGeeks;

/**
 *
 * @author mithilesh.kumar
 */
public class Heapify {

    public static void main(String args[]) {
        int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};
        for (int j = array.length - 1; j >= 0; j--) {
            heapify(array, j);
              
        }
         printMaxHeap(array);
        
        System.out.print("\n");
        System.out.println("Converted Array in to Heap");
        for(int j=0;j<array.length;j++)
        {
            System.out.print(" "+array[j]);
        }
        
    }

    private static void heapify(int[] array, int i) {

        //Arrange Left Child
        int leftChildIndex = i * 2 + 1;
        if (leftChildIndex < array.length) {
            if (array[leftChildIndex] > array[i]) {
                swap(leftChildIndex, i, array);
                heapify(array, leftChildIndex);
            }
        }
        //Arrange Right Child
        int rightChildIndex = i * 2 + 2;
        if (rightChildIndex < array.length) {
            if (array[rightChildIndex] > array[i]) {
                swap(rightChildIndex, i, array);
                heapify(array, rightChildIndex);
            }
        }

    }

    private static void swap(int childIndex, int parentIndex, int[] array) {
        int temp = array[childIndex];
        array[childIndex] = array[parentIndex];
        array[parentIndex] = temp;

    }
    
     private static void printMaxHeap(int [] heap) {
        for (int i = 0; i < heap.length; i++) {
            System.out.print( + heap[i] + " ");
           if (2*i+1 < heap.length) {
                System.out.print("Left Child: " + heap[2*i+1] + " ");
            }
            if (((2*i)+2) < heap.length) {
                System.out.print("Right Child: " + heap[2*i+ 2]);

            }
            if ((2 * i + 2) == heap.length - 1 || 2 * i+1  == heap.length - 1) {
                return;
            }
            System.out.print("\n");

        }
    }
}
