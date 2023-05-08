package com.binary.tree;

public class CoinChange {
    public static long count(int coins[], int N, int sum) {
        // code here.
        long dp[][]=new long[N+1][sum+1];
        for(int i=N-1;i>=0;i--) {
            for(int j=0;j<=sum;j++){
                if(j==0) {
                    dp[i][j]=1;
                    continue;
                }
                long x=0,y=0;
                if(j-coins[i]>=0)
                    x=dp[i][j-coins[i]];
                y=dp[i+1][j];
                dp[i][j]=x+y;
            }
        }
        return dp[0][sum];
    }
    public static void main(String[] args){

        int coins[] = {1,2,3};
        int n = coins.length;
        int sum = 4;
        count(coins,n,sum);

    }
}
