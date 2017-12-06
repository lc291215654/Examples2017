import java.util.Scanner;

/**
 * Created by LICHENG on 2017/9/14.
 */
public class Meituan {

    public static  void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        int k = 0 ;
        while (flag){
            for(int i=n-1;i>=0;i--){
                if(arr[i] == 0){
                    if(i ==0){
                        flag = false;
                        break;
                    }
                    continue;
                }

                for(int j=n-1;j>=i;j--){
                    if(arr[j] == 0){
                        arr[j] = 1;
                    }else{
                        arr[j] = 0;
                    }

                }
                k++;
                break;

            }

        }
        if(k % 2 == 0){
            System.out.println("Bob");
        }else {
            System.out.println("Alice");
        }

    }
}
