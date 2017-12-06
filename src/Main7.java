import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {

    static List<Integer> list = new ArrayList<>();

    static int fun1(int[][] arr,int i,int j,int m,int n){
        if(arr[i-1][j] ==1 && !list.contains((i-1)*m+j)){
            list.add((i-1)*m+j);
            fun1(arr,i-1,j,m,n);
        }
        if(arr[i+1][j] ==1 && !list.contains((i+1)*m+j)){
            list.add((i+1)*m+j);
            fun1(arr,i+1,j,m,n);
        }
        if(arr[i][j-1] ==1 && !list.contains(i*m+j-1)){
            list.add(i*m+j-1);
            fun1(arr,i,j-1,m,n);
        }
        if(arr[i][j+1] ==1 && !list.contains(i*m+j+1)){
            list.add(i*m+j+1);
            fun1(arr,i,j+1,m,n);
        }
        return 1;

    }

    static int cal(int[][] arr,int m,int n){
        int result =0;

        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(arr[i][j] == 1 && !list.contains(i*m+j)){
                    result += fun1(arr,i,j,m,n);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[m+2][n+2];



        int[] result = new int[k];
        for(int i=0;i<k;i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row >=1 && row <=m && col >=1 && col <=n){
                arr[row+1][col+1] = 1;
                result[i] = cal(arr,m+2,n+2);
            }
        }

        for(int j=0;j<k;j++){
            System.out.println(result[j]);
        }



    }
}