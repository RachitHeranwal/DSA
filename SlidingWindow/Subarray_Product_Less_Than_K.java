class Subarray_Product_Less_Than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // no subarray product can be < k

        int left = 0;
        int count = 0;
        int product = 1;

        for(int right = 0; right < nums.length; right++){
            product *= nums[right];

            while (product >= k && left <= right){
                product /= nums[left];
                left++;
            }

            count = left -right + 1;
        }
        return count;
    }

    // Simple test harness (uncomment after implementing the method)
    public static void main(String[] args) {
        Subarray_Product_Less_Than_K sol = new Subarray_Product_Less_Than_K();

        int[] nums1 = {10, 5, 2, 6};
        int k1 = 100;
        // Expected: 8
        System.out.println(sol.numSubarrayProductLessThanK(nums1, k1));

        int[] nums2 = {1,1,1};
        int k2 = 2;
        // Expected: 0
        System.out.println(sol.numSubarrayProductLessThanK(nums2, k2));
    }
}
