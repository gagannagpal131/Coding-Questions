class Solution {

    //DFS
    public boolean canCross(int[] stones) {

        Set<Integer> units = new HashSet<>();
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < stones.length; i++) {

            if (i > 0 && stones[i] - stones[i - 1] > i)
                return false;

            units.add(stones[i]);
        }

        return doesPathExist(stones, 1, 1, units, visited);
    }

    private boolean doesPathExist(int stones[], int stone, int jump, Set<Integer> units, Set<String> visited){

        String check = stone + "-" + jump;

        if(visited.contains(check))
            return false;

        if(jump <= 0)
            return false;

        if(!units.contains(stone))
            return false;

        if(stone == stones[stones.length-1])
            return true;

        visited.add(check);

        return (doesPathExist(stones, stone+jump-1, jump-1, units, visited)
                || doesPathExist(stones, stone+jump, jump, units, visited)
                || doesPathExist(stones, stone+jump+1, jump+1, units, visited));
    }
}
