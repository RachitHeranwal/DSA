package SlidingWindow;

public class LogestSubstringcharactersReplacement  {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, right = 0;
        int maxCount = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxCount = Math.max(maxCount, freq[c - 'A']);

            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LogestSubstringcharactersReplacement  sol = new LogestSubstringcharactersReplacement ();

        System.out.println(sol.characterReplacement("AABABBA", 1)); // 4
        System.out.println(sol.characterReplacement("ABAB", 2));    // 4
        System.out.println(sol.characterReplacement("AAAA", 2));    // 4
        System.out.println(sol.characterReplacement("ABCDE", 1));   // 2
    }
}
