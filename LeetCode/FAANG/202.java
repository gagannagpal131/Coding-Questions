class Solution {
    public boolean isHappy(int n) {

        boolean returnVar = true;

        while(true){

            //Only single digit numbers that can be "happy" are 1 & 7
            if(n >= 0 && n < 10){

               if(n == 1 || n == 7){
                   break;
               } else{
                   returnVar = false;
                   break;
               }
            }

            //Method to calculate square of digits
            int num = 0;
            while(n > 0){
                
                int rem = n%10;
                num = num + rem*rem;
                n = n/10;
            }

            n = num;
        }

       return returnVar;
    }
}
