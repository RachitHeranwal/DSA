package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithoutcharcters {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set = new HashSet<>();
      int l = 0, r= 0;
      int maxLength = 0;

      while(r < s.length()){
          char c = s.charAt(r);
          if(!set.contains(c)){
              set.add(c);
              maxLength = Math.max(maxLength, r -l + 1);
              r++;
          }else {
              set.remove(s.charAt(l));
              l++;
          }
      }

      return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringwithoutcharcters solution = new LongestSubstringwithoutcharcters();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(solution.lengthOfLongestSubstring(""));         // 0
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));     // 3
    }
}
