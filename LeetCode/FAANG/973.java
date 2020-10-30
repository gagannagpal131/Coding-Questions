class Solution {
    public int[][] kClosest(int[][] points, int K) {

        Comparator<int[]> myComparator = new Comparator<int[]>(){

           public int compare(int a[], int b[]){

                int dist1 = a[0]*a[0] + a[1]*a[1];
                int dist2 = b[0]*b[0] + b[1]*b[1];

                return dist1 - dist2;
            }
        };

        Queue<int[]> minHeap = new PriorityQueue<int[]>(myComparator);

        for(int[] nums: points){

            minHeap.add(nums);
        }

        int returnArr[][] = new int[K][2];

        for(int i=0; i < K; i++){

            int num[] = minHeap.poll();

            returnArr[i][0] = num[0];
            returnArr[i][1] = num[1];
        }

        return returnArr;
    }
}
