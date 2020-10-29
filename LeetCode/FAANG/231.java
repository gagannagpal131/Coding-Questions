class Solution {
    public boolean isPowerOfTwo(int n) {

        long i = 1;

        while(i <= n){

            if(i == n)
                return true;

            //System.out.println(i);
            i = i*2;
        }

        return false;
    }
}
