class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arr[] = new int[2];

        for(int i=0; i < nums.length; i++){

            int rem = target - nums[i];

            if(map.containsKey(rem)){

                arr[0] = i;
                arr[1] = map.get(rem);
                break;
            }

            map.put(nums[i], i);
        }

        return arr;
    }
}
