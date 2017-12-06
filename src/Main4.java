import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main4 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String A[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

    static String change(int m, int n) {
        String result = "";
        StringBuffer sb = new StringBuffer();
        while (m > 0){
            int t = m % n;
            sb.append(A[t]);
            m = m/n;
        }
        return sb.reverse().toString();
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        res = change(_m, _n);
        System.out.println(res);
        //System.out.println(1/4);
    }
}
