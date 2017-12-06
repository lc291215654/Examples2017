package org.niuke;

/**
 * Created by LICHENG on 2017/11/27.
 */

import java.util.*;
public class LCS {
    public static void  main(String args[]){

        int a = findfindLongest("zynnqufc",8,"ddyaufch",8);
        System.out.println(a);



    }

    public static  int findfindLongest(String A, int n, String B, int m){
        int[][] table = new int[n+1][m+1];
        char[] chsA = A.toCharArray();
        char[] chsB = B.toCharArray();

        int max = 0;

        for(int i=0;i<n;i++){
            if(chsA[i]==chsB[0]){
                table[i][0] = 1;
            }
        }

        for(int j=0;j<m;j++){
            if(chsA[0]==chsB[j]){
                table[0][j] = 1;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(chsA[i] == chsB[j]){
                    table[i][j] = table[i-1][j-1]+1;
                    max = Math.max(table[i-1][j-1]+1,max);
                }
            }
        }
        return max;
    }

}
