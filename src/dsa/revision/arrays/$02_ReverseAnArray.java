package dsa.revision.arrays;

import java.util.Arrays;

class $02_ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1};
        reverseArray(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {

        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
}
