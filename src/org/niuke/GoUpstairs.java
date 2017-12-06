package org.niuke;

/**
 * Created by LICHENG on 2017/11/27.
 */
public class GoUpstairs {

    public static void  main(String args[]){

        int a = countWays(3);
        System.out.println(a);



    }
    public static int countWays(int n) {

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        if(n>2) {
            for (int i = 3; i < n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 100000000;
            }
        }
        return dp[n-1];
    }
}
