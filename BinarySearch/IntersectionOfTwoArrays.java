class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;

        int[] temp = new int[Math.min(m,n)];
        int k = 0;

        for(int i = 0; i < n; i++){
            
            int left = 0;
            int right = m - 1;

            while (left <= right){
                int mid = left + (right - left) / 2;

                if(nums1[mid] == nums2[i]){
                    if(k == 0 || temp[k - 1] != nums2[i]){
                        temp[k++] = nums2[i];
                    }
                    break;
                }else if(nums1[mid] < nums2[i]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return Arrays.copyOf(temp,k);
    }
}
