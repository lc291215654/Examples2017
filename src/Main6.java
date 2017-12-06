import java.math.BigDecimal;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        int n = sc.nextInt();
        float ans=1;
        int i;
        for(i=1;i<=n;++i)
            ans*=r;

        System.out.println(ans);
    }
}

//for(int i=0;i<m+2;i++){
//        for(int j=0;j<n+2;j++){
//        if(i ==0 || j==0 || i==m+1 || j==n+1){
//        arr[i][j] = 0 ;
//        }
//        }
//        }