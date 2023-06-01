package dsa.revision.arrays;

class $04_MaximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArrayPairSum(arr));
        System.out.println(kadanesAlgorithm(arr));
    }

    public static int maxSubArrayPairSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    public static int kadanesAlgorithm(int[] arr) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i : arr) {
            sum += i;
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
