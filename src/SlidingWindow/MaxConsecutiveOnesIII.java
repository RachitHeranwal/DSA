package SlidingWindow;

import java.util.*;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxLength = 0, zeroes = 0;

        while (r < nums.length){
            if (nums[r] == 0){
                zeroes++;
            }

            if (zeroes > k) {
                if (nums[l] == 0) {
                    zeroes--;
                }
                l++;
            }
            if ( zeroes <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
            }
            r++;
        }
        return maxLength;
//    int maxLength = 0;
//
//        for(int i = 0; i < nums.length; i++){
//        int zeroes = 0;
//        for(int j = i; j <  nums.length;j++){
//            if(nums[j] == 0){
//                zeroes++;
//            }
//            if(zeroes <= k){
//                int len = j - i + 1;
//                maxLength = Math.max(maxLength, len);
//            }else {
//                break;
//            }
//        }
//    }
//        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        int k2 = 2;

        System.out.println("Test case 1: " + longestOnes(nums1, k1)); // Expected 6
        System.out.println("Test case 2: " + longestOnes(nums2, k2)); // Expected 7
    }
}
