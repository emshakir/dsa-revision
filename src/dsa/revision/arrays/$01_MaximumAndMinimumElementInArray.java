package dsa.revision.arrays;

class $01_MaximumAndMinimumElementInArray {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 1, 9};
        printMinAndMax(arr);
        _printMinAndMax(arr);
    }

    public static void printMinAndMax(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int a : arr) {
            min = Math.min(min, a);
            max = Math.max(max, a);
        }

        System.out.println("Minimum :::: " + min);
        System.out.println("Maximum :::: " + max);
    }

    // Using Minimum number of comparisions
    public static void _printMinAndMax(int[] arr) {

        int min = arr[0];
        int max = arr[1];

        if (min > max) {
            min = arr[1];
            max = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println("Minimum :::: " + min);
        System.out.println("Maximum :::: " + max);
    }
}
