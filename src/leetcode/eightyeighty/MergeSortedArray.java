package leetcode.eightyeighty;

import java.util.Arrays;

class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0, i = 0, j = 0;
        int[] tempNum = Arrays.copyOf(nums1, nums1.length);
        while (j < n) {
            if (tempNum[i] < nums2[j] && i < m) {
                nums1[k] = tempNum[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m + n && tempNum[i] != 0) {
            nums1[k] = tempNum[i];
            i++;
            k++;
        }

    }
}