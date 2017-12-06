import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 *给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，
 * 编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
 *输入描述:
 *输入为一个数字N，即需要拼凑的面额
 *输出描述:
 *输出也是一个数字，为组成N的组合个数。
 *
 *示例1
 *输入
 *5
 *输出
 *2
 *
 */

public class Main3 {

    public static Map<Integer,Long> map = new HashMap<Integer,Long>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int sum = s.nextInt();

        int[] coins = {1, 5, 10, 20, 50, 100};//存储能用的硬币面额




        System.out.println(fn(21));
    }

    public static long fn(int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n >= 100){
            long value = fn(n-1)+fn(n-5)+fn(n-20)+fn(n-100) ;
            map.put(n,value);
            return  value;
        }else if(n >= 20){
            long value = fn(n-1)+fn(n-5)+fn(n-20) ;
            map.put(n,value);
            return value;
        }else if(n >= 5 ){
            long value = fn(n-1)+fn(n-5) ;
            map.put(n,value);
            return value;
        }else if(n >=0){
            map.put(n,1l);
            return 1;
        }else {
            System.out.println("error");
            return 0;
        }
    }

}