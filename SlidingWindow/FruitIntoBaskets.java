package SlidingWindow;
import java.util.*;

public class FruitIntoBaskets {
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, res = 0;
        for (int right = 0; right < fruits.length; right++) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);
            while (count.size() > 2) {
                int f = fruits[left];
                count.put(f, count.get(f) - 1);
                if (count.get(f) == 0) count.remove(f);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] fruits1 = {1, 2, 1};
        int[] fruits2 = {0, 1, 2, 2};
        int[] fruits3 = {1, 2, 3, 2, 2};
        System.out.println("Test case 1: " + totalFruit(fruits1)); // Expected 3
        System.out.println("Test case 2: " + totalFruit(fruits2)); // Expected 3
        System.out.println("Test case 3: " + totalFruit(fruits3)); // Expected 4
    }
}
