package dsa.revision.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class $05_KthLargestElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
//        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        final int K = 2;
        int result = getKthLargestElement(arr, 0, arr.length - 1, K);
        System.out.println("Result :::: " + result);
    }

    /*
        If our pivot is at our "kth largest" index, return the number at that index.
        If our pivot comes before(<) the "kth largest" index, perform quickselect on the right partition.
        If our pivot comes after(>) the "kth largest" index, perform quickselect on the left partition.
     */
    public static int getKthLargestElement(int[] nums, int start, int end, int k) {
        while (start <= end) {
            int pivot = getPivot(nums, start, end);
            if (pivot == k - 1) {
                return nums[pivot];
            } else if (pivot < k - 1) {
                return getKthLargestElement(nums, pivot + 1, end, k);
            } else {
                return getKthLargestElement(nums, start, pivot - 1, k);
            }
        }
        return -1;
    }

    private static int getPivot(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        i++;
        swap(nums, i, end);
        return i;
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    // Using PriorityQueue
    public int getKthLargestMinHeap(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public int getKthLargestMaxHeap(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(nums.length, (a, b) -> b - a);

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}

/*
   <Leetcode link> 
    https://leetcode.com/problems/kth-largest-element-in-an-array/solutions/2180600/a-guide-to-quick-select-java/
 */
