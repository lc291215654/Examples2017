import java.util.Scanner;
import java.util.Map;
import java.util.Vector;


public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = s.nextInt();

        int[] coins = {1, 5, 10, 20, 50, 100};//存储能用的硬币面额

        long[] dp = new long[sum + 1];
        dp[0] = 1L;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                if (j >= coins[i]) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}

class TT{

}