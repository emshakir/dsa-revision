package dsa.revision.arrays;

class $07_ContainerWithMostWater {

    public static void main(String[] args) {

        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(getMaxAreaContainerOpt(input));

    }

    public static int getMaxAreaContainer(int[] arr) {
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) { //TC- O(n^2)
            for (int j = i + 1; j < arr.length; j++) {

                // int distance = j - i;
                // int minPole = Math.min(arr[i], arr[j]);
                // int currArea = minPole * distance;
                maxArea = Math.max(maxArea, Math.min(arr[i], arr[j]) * (j - i));
            }
        }

        return maxArea;
    }

    public static int getMaxAreaContainerOpt(int[] arr) { // TC - O(N)

        int p1 = 0;
        int p2 = arr.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (p1 < p2) {
            maxArea = Math.max(maxArea, Math.min(arr[p1], arr[p2]) * (p2 - p1));

            if (arr[p1] <= arr[p2]) {
                p1++;
            } else {
                p2--;
            }
        }

        return maxArea;

    }
}
