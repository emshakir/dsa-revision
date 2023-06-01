package dsa.revision.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = {7, 5, 2, 1, 6, 8, 4, 3};
        System.out.println("Execution Started ::: ");
        divide(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    public static void divide(int[] input, int si, int ei) {

        if (si < ei) {
            int middle = si + (ei - si) / 2;
            divide(input, si, middle);
            divide(input, middle + 1, ei);
            conquer(input, si, middle, ei);
        }
    }

    private static void conquer(int[] input, int si, int middle, int ei) {
        int[] tempArray = new int[ei - si + 1];

        int srcArrayIdx = si;
        int destArrayIdx = middle + 1;
        int tempIdx = 0;

        while (srcArrayIdx <= middle && destArrayIdx <= ei) {

            if (input[srcArrayIdx] <= input[destArrayIdx]) {
                tempArray[tempIdx++] = input[srcArrayIdx++];
            } else {
                tempArray[tempIdx++] = input[destArrayIdx++];
            }
        }

        // remaining elements of src array
        while (srcArrayIdx <= middle) {
            tempArray[tempIdx++] = input[srcArrayIdx++];
        }

        // remaining elements from dest array
        while (destArrayIdx <= ei) {
            tempArray[tempIdx++] = input[destArrayIdx++];
        }

        for (int i = 0, j = si; i < tempArray.length; i++, j++) {
            input[j] = tempArray[i];
        }
    }

}


/*


    // 7, 5, 2, 1, 6, 8, 4, 3

    7 5 2 1                6 8 4 3 
    
    1 2 5 7              6 8   4  3
    
    1 2 5 7              6  8  4   3

    src         destArrayIdx
    7           5 

        5 7   si = 0 && ei = 1

 */
