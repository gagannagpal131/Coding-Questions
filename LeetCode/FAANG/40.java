class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Set<List<Integer>> set = new HashSet<List<Integer>>();
        List<Integer> innerList = new ArrayList<Integer>();

        Arrays.sort(candidates);

        findCombinations(candidates, target, set, 0, innerList);

        List<List<Integer>> list = new ArrayList<List<Integer>>(set);

        return list;
    }

    private void findCombinations(int[] candidates, int target, Set<List<Integer>> set, int index, List<Integer> innerList){

        if(target == 0){

            //System.out.println(innerList);
            set.add(new ArrayList(innerList));
            return;
        }

        if(target < 0)
            return;

        for(int i = index; i < candidates.length; i++){

            innerList.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], set, i + 1, innerList);
            innerList.remove(innerList.size()-1);
        }
    }
}
