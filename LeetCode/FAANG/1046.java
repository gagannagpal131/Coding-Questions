class Solution {
    public int lastStoneWeight(int[] stones) {

        //Custom Comparator for Max Heap
        Comparator<Integer> myComparator = new Comparator<Integer>(){

            public int compare(Integer a, Integer b){
                return b-a;
            }
        };

        Queue<Integer> maxHeap = new PriorityQueue<Integer>(myComparator);

        for(int stone: stones)
            maxHeap.add(stone);

        while(maxHeap.size() > 1){

            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if(stone1 == stone2)
                continue;

            if(stone1 > stone2)
                maxHeap.add(stone1-stone2);
        }

        if(maxHeap.size() == 0)
            return 0;

        return maxHeap.poll();
    }
}
