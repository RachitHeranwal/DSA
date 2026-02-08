class Solution {
    public boolean isPerfectSquare(int num) {
        if( num < 2) return true;

        int left = 0;
        int right = num;

        while(left <= right){
            int mid = left + ( right - left ) /2;
            long sq = 1L * mid * mid;

            if(sq < num ){
                 left = mid + 1;
            }else if(sq > num) {
                right = mid - 1;
            }else {
                return true;
            }  
        }
        return false;

    }
}