package dsa.revision.arrays;

class $08_TrappingRainWater {

    public static void main(String[] args) {

        int[] input = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped Water ::: " + getMaxTrappedWater(input));
		System.out.println("Trapped Water ::: " + getTrappedWaterOpt(input));
    }

    public static int getTrappedWaterOpt(int[] height) {

        int p1 = 0;
        int p2 = height.length - 1;

        int minLeft = 0;
        int minRight = 0;
		
        int trappedWater = 0;
		
        while (p1 < p2) {

            if (height[p1] < height[p2]) {

                if (height[p1] > minLeft) {
                    minLeft = height[p1];
                } else {
                    trappedWater += minLeft - height[p1];
                }

                p1++;
            } else {

                if (height[p2] > minRight){
                    minRight = height[p2];
                } else {
                    trappedWater += minRight - height[p2];
                }

                p2--;
            }
        }

        return trappedWater;
    }

    public static int getMaxTrappedWater(int[] array) {

        int trappedWater = 0;
        int[] maxLeft = new int[array.length];
        int[] maxRight = new int[array.length];

        maxLeft[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], array[i]);
        }

        int n = array.length;
        maxRight[n - 1] = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int minHeight = Math.min(maxLeft[i], maxLeft[i]);
            trappedWater += minHeight - array[i];
        }

        return trappedWater;

    }

}

/*

	// Brute Force

					4	2	0	3	2	5 - O(N)
					
					4	4	4	4	4	5 - O(N)
					5	5	5	5	5	5 - O(N)
					
					
	// Optimal
	
		4	2	0	3	2	5 -> TC - O(N) and SC - O(1)
		
		
		minLeft = INTEGER.MIN_VALUE
		minRight = INTEGER.MIN_VALUE

1. Will I have a -ve number - YES - Subtract / NO - Ok

2. WIll I duplicates? Even If I have Duplicates, that ok I'll calculate 


 */
