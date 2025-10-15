package Strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++){

            for (int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    // Main method
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("LCP: " + longestCommonPrefix(strs1)); // Output: fl

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("LCP: " + longestCommonPrefix(strs2)); // Output: (empty string)

        String[] strs3 = {"apple", "app"};
        System.out.println("LCP: " + longestCommonPrefix(strs3)); // Output: app
    }
}
