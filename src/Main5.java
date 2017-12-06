import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main5 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int test(int n) {

        int i = 3;
        int arr[] = new int[200];
        int index = 0 ;
        while ( i <= 1000){
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    break;
                }
                if(j == i-1){
                    arr[index++] = i;
                    break;
                }
            }
            i++ ;
        }
        int result =0;
        for (int k=0;k<index/2;k++) {
            for(int j=k;j<index;j++){
                if(arr[k] + arr[j] == n){
                    result++;
                }

            }
        }

        for(int p=0 ; p<index;p++){
            System.out.println(arr[p]);
        }
        return result;


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int n;
        n = Integer.parseInt(in.nextLine().trim());

        res = test(n);
        System.out.println(String.valueOf(res));

    }
}
