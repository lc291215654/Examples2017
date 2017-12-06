import java.util.Scanner;


public class Main2 {
    public static int n;
    public static int[][] D;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        D = new int[n][n];
        for (int i = 0;i < n; i++){
            for(int j=0;j <= i;j++){
                D[i][j] = s.nextInt();
            }
        }

        System.out.println(maxSum(0,0));
    }

    public static int maxSum(int i, int j) {
        if (i == n -1) {
            return D[i][j];
        }
        int x = maxSum(i + 1, j);
        int y = maxSum(i + 1, j + 1);
        return Math.max(x, y) + D[i][j];
    }


}