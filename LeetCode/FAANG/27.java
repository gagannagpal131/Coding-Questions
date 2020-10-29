class Solution {

    //Two Pointer Approach
    //Moving all required elements to the front of array
    public int removeElement(int[] nums, int val) {

       int index = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != val){

                nums[index] = nums[i];
                index++;

            }
        }

        return index;
    }
}
