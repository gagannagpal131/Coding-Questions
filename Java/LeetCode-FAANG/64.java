class Solution {
    public int minPathSum(int[][] grid) {

        Map<String, Integer> visited = new HashMap<String, Integer>();
        return findMinSum(grid, 0, 0, visited);
    }

    private int findMinSum(int grid[][], int row, int col,  Map<String, Integer> visited){

        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return Integer.MAX_VALUE;

        String key = row+"-"+col;
        if(visited.containsKey(key))
            return visited.get(key);

        if(row == grid.length-1 && col == grid[0].length-1)
            return grid[row][col];

        int min = Math.min(findMinSum(grid, row+1, col, visited), findMinSum(grid, row, col+1, visited));

        int minSum = min + grid[row][col];
        visited.put(key, minSum);

        return minSum;
    }
}
