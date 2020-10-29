class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int myColor = image[sr][sc];

        fillColor(image, sr, sc, newColor, myColor);

        return image;
    }

    public void fillColor(int[][] image, int row, int col, int newColor, int myColor) {

        if(image[row][col] == newColor)
            return;

        if(image[row][col] != myColor)
            return;

        image[row][col] = newColor;

        if(row > 0)
            fillColor(image, row-1, col, newColor, myColor);

        if(row < image.length-1)
            fillColor(image, row+1, col, newColor, myColor);

        if(col > 0)
            fillColor(image, row, col-1, newColor, myColor);

        if(col < image[0].length-1)
            fillColor(image, row, col+1, newColor, myColor);
    }
}
