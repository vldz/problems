package com.vanillastorm.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Given two arrays. Finds their intersection.
 *
 */

public class IntersectTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList();
        int[] resultInCaseZero = new int[result.size()];

        if (nums1.length == 0 || nums2.length == 0) {
            return resultInCaseZero;
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
                if (j >= nums2.length) break;
            }

            if (nums1[i] < nums2[j]) {
                i++;
                if (i >= nums1.length) break;
            }

            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] newResult = new int[result.size()];
        for (int k = 0; k < newResult.length; k++) {
            newResult[k] = result.get(k);
        }

        return newResult;

    }

}
