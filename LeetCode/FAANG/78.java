class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        List<Integer> innerList = new ArrayList<Integer>();

        findSubsets(nums, 0, innerList, finalList);

        return finalList;
    }

    public void findSubsets(int nums[], int index, List<Integer> innerList, List<List<Integer>> finalList){

        finalList.add(new ArrayList(innerList));

        for(int i = index; i < nums.length; i++){

            innerList.add(nums[i]);
            findSubsets(nums,i+1, innerList, finalList);
            innerList.remove(innerList.size()-1);
        }
    }
}
