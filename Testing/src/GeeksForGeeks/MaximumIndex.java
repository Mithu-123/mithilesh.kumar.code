package GeeksForGeeks;

import java.util.Scanner;

class Branch {

    int element;
    int index;
    Branch left;
    Branch right;

    public Branch(int element, int index) {
        this.element = element;
        this.index = index;
        left = right = null;
    }
}

class MaximumIndex {

    public static void main(String args[]) {
        int testCase, size;
          int array[] = null;
        Scanner input = new Scanner(System.in);
        testCase = input.nextInt();
        if (1 <= testCase && testCase <= 1000) {
            
            size=input.nextInt();
            array =new int[size];
            if(1<=size && size<=10000000)
            {
                for(int i=0;i<size;i++)
                {
                    array[i]=input.nextInt();
                    
                }
            }

            int maxDiff = findMaximumIndexDiff(array);
            System.out.println("Maximum Difference between Indexes -->"+maxDiff);
            }
        }

    
    
    
    
    
    
    

    private static int findMaximumIndexDiff(int[] array) {

        Branch root = null, newBranch;
        Branch temp, preTemp;
        root = new Branch(array[0], 0);
        int indexDiff, maxIndexDiff;
        indexDiff = maxIndexDiff = 0;
        for (int i = 1; i < array.length; i++) {
            newBranch = new Branch(array[i], i);
            temp = preTemp = root;
            while (temp != null) {

                preTemp = temp;
                if (newBranch.element > temp.element) {

                    indexDiff = newBranch.index - temp.index;
                    if (indexDiff > maxIndexDiff) {
                        maxIndexDiff = indexDiff;
                    }

                    temp = temp.right;

                } else {
                    temp = temp.left;
                }

            }

            if (newBranch.element > preTemp.element) {
                preTemp.right = newBranch;
            }
            if (newBranch.element <= preTemp.element) {
                preTemp.left = newBranch;
            }

        }

        return maxIndexDiff;
    }

}
