class Solution {
    public int minDominoRotations(int[] A, int[] B) {

        int rowA[] = new int[7];
        int rowB[] = new int[7];
        int maxRowA = Integer.MIN_VALUE;
        int maxRowB = Integer.MIN_VALUE;
        int numA = 0;
        int numB = 0;

        for(int i=0; i < A.length; i++){

            rowA[A[i]] = rowA[A[i]] + 1;
            rowB[B[i]] = rowB[B[i]] + 1;
        }

        for(int i = 1; i < rowB.length; i++){

            if(maxRowA < rowA[i]){
                maxRowA = rowA[i];
                numA = i;
            }
        }

        for(int i = 1; i < rowA.length; i++){

            if(maxRowB< rowB[i]){
                maxRowB = rowB[i];
                numB = i;
            }
        }

        int count = 0;
        for(int i=0; i < A.length; i++){

            if(maxRowA >= maxRowB){

                if(A[i] != numA && B[i] != numA)
                    return -1;

                if(A[i] != numA && B[i] == numA)
                    count++;


            } else if(maxRowB > maxRowA){

                if(B[i] != numB && A[i] != numB)
                    return -1;

                if(B[i] != numB && A[i] == numB)
                    count++;
            }
        }

        return count;
    }
}
