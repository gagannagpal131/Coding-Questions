class Solution {
    public int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;
        int right = height.length-1;
        int left = 0;

        while(left < right){

          int area = Math.min(height[left], height[right])* (right-left);

          if(maxArea < area)
                maxArea = area;

          if(height[left] > height[right]){

              right--;

          } else if(height[left] <= height[right]){

              left++;
          }

          //System.out.println(maxArea);
        }

        return maxArea;
    }
}
