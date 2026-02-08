public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int right = n ;

        while( low <= right){
            int mid = low + (right - low)/2;
            int res = guess(mid);

            if( res == 0 ){
                return mid;
            }else if(res < 0){
                right = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}