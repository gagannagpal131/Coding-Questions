class Solution {
    public int balancedStringSplit(String s) {

        int RCount = 0;
        int LCount = 0;
        int count = 0;

        for(int i=0; i < s.length(); i++){

            if(s.charAt(i) == 'R')
                RCount++;

            if(s.charAt(i) == 'L')
                LCount++;

            if(LCount > 0 && RCount > 0 && LCount == RCount){
                count++;
                RCount = 0;
                LCount = 0;
            }
        }
        return count;
    }
}
