package SlidingWindow;

public class Sliding {


    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int l = 0;
        int r = n - k;

        int total = 0;
        for (int i = r; i < n; i++) {
            total += cardPoints[i];
        }

        int res = total;

        while(r < n) {
            total += cardPoints[l] - cardPoints[r];
            res = Math.max(res,total);
            l++;
            r--;
        }

        return res;
    }

    // 🔽 Main method for testing
    public static void main(String[] args) {
        Sliding solution = new Sliding();

        // Test Case 1
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int result = solution.maxScore(cardPoints, k);
        System.out.println("Max score: " + result); // Output: 12

        // Test Case 2
        int[] cardPoints2 = {2, 2, 2};
        k = 2;
        System.out.println("Max score: " + solution.maxScore(cardPoints2, k)); // Output: 4

        // Test Case 3
        int[] cardPoints3 = {9, 7, 7, 9, 7, 7, 9};
        k = 7;
        System.out.println("Max score: " + solution.maxScore(cardPoints3, k)); // Output: 55
    }
}
