class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;

        while (left < right) {

            if(height[left] <= height[right]){

                if(height[left] >= maxLeft)
                    maxLeft = height[left];

                result = result + maxLeft - height[left];
                left++;

            } else if(height[right] < height[left]){

                if(height[right] >= maxRight)
                    maxRight = height[right];

                result = result + maxRight - height[right];
                right--;
            }
        }

        return result;
    }
}
