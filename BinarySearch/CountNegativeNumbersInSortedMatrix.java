class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = m - 1;
        int coln = 0;
        int count = 0;

        while(row >= 0 && coln < n){
         if(grid[row][coln] < 0){
            count += (n - coln);
            row --;
         }else {
            coln++;
         }
        }
        return count;
    }
}