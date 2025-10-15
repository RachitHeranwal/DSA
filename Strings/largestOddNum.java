package Strings;

public class largestOddNum {
    /**
     * Finds the largest odd number substring by removing trailing even digits.
     * @param num The input numeric string.
     * @return The largest odd number substring or empty string if none exists.
     */
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";

    }


    public static void main(String[] args) {
        largestOddNum solution = new largestOddNum();

        // Example 1:
        String input1 = "12345678";
        System.out.println("Input: " + input1);

        // The largest odd number substring here should be "1234567"
        // because '7' at index 6 is the rightmost odd digit, remove trailing '8'
        String result1 = solution.largestOddNumber(input1);
        System.out.println("Largest odd number substring: " + result1);

        System.out.println();

        // Example 2:
        String input2 = "4206";
        System.out.println("Input: " + input2);

        // Here, no digit in the string is odd,
        // so the result should be an empty string
        String result2 = solution.largestOddNumber(input2);
        System.out.println("Largest odd number substring: " + result2);
    }
}
