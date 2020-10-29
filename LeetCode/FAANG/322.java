class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[] = new int[amount+1];

        Arrays.fill(dp,amount+1);

        dp[0] = 0;

        for(int i = 1; i < dp.length; i++){

            for(int coin: coins){

                if(i < coin)
                    continue;

                int remainder = i - coin;
                dp[i] = Math.min(dp[remainder]+1, dp[i]);

            }
        }

        if(dp[amount] == amount+1)
            return -1;
        
        return dp[amount];
    }
}
