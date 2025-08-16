package SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int maxLength = s1.length();
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        for(int left = 0; left <= len2 - len1 ; left++) {
            char[] window = s2.substring(left, left + len1).toCharArray();
            Arrays.sort(window);
            if (Arrays.equals(arr1, window)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString sol = new PermutationInString();

            // Example test cases
            String s1 = "ab";
            String s2 = "eidbaooo";

            boolean result = sol.checkInclusion(s1, s2);
            System.out.println("Result: " + result); // Expected: true

            String s1b = "ab";
            String s2b = "eidboaoo";

            boolean result2 = sol.checkInclusion(s1b, s2b);
            System.out.println("Result: " + result2); // Expected: false
        }
    }

