import java.util.Scanner;

/**
 * Created by LICHENG on 2017/9/13.
 */
public class Tengxun {

    public static  void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(arr[j] == i && (j >=i)){
                    int temp = arr[j];
                    arr[j] = arr[i -1];
                    arr[i -1] = temp;
                    flag=true;
                    break;
                }

            }
            if(flag){
                break;
            }


        }

        for(int i=0;i<n;i++){

            if(i == n-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
