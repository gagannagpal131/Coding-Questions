class Solution {
    public int maxAreaOfIsland(int[][] grid) {

      int maxCount = 0;

        for(int row=0; row<grid.length; row++){

            for(int col=0; col<grid[row].length; col++){

                if(grid[row][col] == 1){
                   maxCount = Math.max(maxCount, maxArea(grid, row, col));
                }
            }
        }

        return maxCount;
    }

    public int maxArea(int[][] grid, int row, int col){

        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == -1 || grid[row][col] == 0){

            return 0;
        }

        int count = 1;
        grid[row][col] = -1;

        count = count + maxArea(grid, row-1, col);
        count = count + maxArea(grid, row+1, col);
        count = count + maxArea(grid, row, col+1);
        count = count + maxArea(grid, row, col-1);

        return count;
    }
}
