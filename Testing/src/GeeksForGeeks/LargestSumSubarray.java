package GeeksForGeeks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author mithilesh.kumar
 */
public class LargestSumSubarray {

    public static void main(String args[]) {
        int array[] = {-2, 3, 4, -1, 2, 1, -5, -3};
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int start_Index, end_Index;
        start_Index = end_Index = 0;
        boolean isStartIndexUpdated = true;
        
   
        for (int i = 0; i < array.length; i++) {
            max_ending_here = max_ending_here + array[i];

            if (max_ending_here > max_so_far) {
                if (isStartIndexUpdated) {
                    start_Index = i;
                    isStartIndexUpdated = false;
                }
                max_so_far = max_ending_here;
                end_Index = i;
            }
            if (max_ending_here < 0) {
                isStartIndexUpdated = true;
                max_ending_here = 0;
            }

        }

        System.out.println("Largest Sum contiguous Array:=> " + max_so_far);
        System.out.println("Start Index of  contiguous Array:=> " + start_Index);
        System.out.println("End Index of  contiguous Array:=> " + end_Index);
    }

}
