package ca.jrvs.challenge;

import java.util.Arrays;

import static java.util.Arrays.sort;


public class MergeSortedArrays {
    public static void merge(int[] nums1, int[] nums2) {
        int j = 0;
        int[] result;
        int[] small;

        if (nums1.length > nums2.length) {
            result = nums1;
            small = nums2;
        } else {
            result = nums2;
            small = nums1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = small[j];
                j++;
            }
        }

        sort(result);
        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3}, new int[]{2, 5, 6,0,0,0});
    }
}
