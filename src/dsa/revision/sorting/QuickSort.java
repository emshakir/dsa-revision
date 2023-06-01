package dsa.revision.sorting;


import java.util.Arrays;

class QuickSort {

    public static void main(String[] args) {

        int[] input = {8, 5, 7, 6, 41, 29, 6, 3};
        quickSort(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    public static void quickSort(int[] input, int si, int ei) {
        if (si < ei) {
            int pivotIdx = getPivotIndex(input, si, ei);
            quickSort(input, si, pivotIdx - 1);
            quickSort(input, pivotIdx + 1, ei);
        }
    }

    private static int getPivotIndex(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j <= ei; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        i++;
        swap(arr, i, ei);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


/*
	
	i = start - 1 => 0 - 1 = -1
	i = 5
	
	8	5	7	6	41	29	6	3 => si = 0 && ei = 7 => pivot = 3
	
	3	5	7	6	6	8	41	29 => si = 1 && ei = 7 returned i = 0 => pivot;
		

 */
