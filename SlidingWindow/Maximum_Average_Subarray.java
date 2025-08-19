package SlidingWindow;

public class Maximum_Average_Subarray {
    public double findMaxAverage(int[] nums, int k) {
        // TODO: implement sliding window logic here
        int left = 0;
        double maxSum= 0;

        for(int right = left + k -1; right < nums.length ; right++) {
            int m = right;
            int sum = 0;

            while(m >= left) {
                sum = sum + nums[m];
                m--;
            }
            double div = (double) sum / k;
            maxSum = Math.max(maxSum,div);
            left++;
        }
        return maxSum;
    }

        public static void main(String[] args) {
            Maximum_Average_Subarray solution = new Maximum_Average_Subarray();

            int[] nums = {1,12,-5,-6,50,3};
            int k = 4;

            double result = solution.findMaxAverage(nums, k);
            System.out.println("Maximum Average Subarray: " + result);
        }
}
