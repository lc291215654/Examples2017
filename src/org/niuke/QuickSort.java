package org.niuke;

/**
 * Created by LICHENG on 2017/12/4.
 */
public class QuickSort {

    public int getMiddle(int[] arrayInt, int low, int high) {
        int tmp = arrayInt[low];

        while (low < high) {

            while (low < high && tmp < arrayInt[high]) {
                high--;
            }
            arrayInt[low] = arrayInt[high];// 比中轴小的记录移到低端

            while (low < high && arrayInt[low] < tmp) {
                low++;
            }
            arrayInt[high] = arrayInt[low];
        }
        arrayInt[low] = tmp;

        return low;
    }

    public void quicksort(int[] arrayInt, int low, int high) {
        if (low < high) {
            int mid = getMiddle(arrayInt, low, high);
            quicksort(arrayInt, low, mid);
            quicksort(arrayInt, mid + 1, high);
        }
    }

    public static void main(String args[]) {
        QuickSort qs = new QuickSort();
        int[] testArray = { 34, 3, 53, 2, 23, 7, 14, 10 };
        qs.quicksort(testArray, 0, testArray.length - 1);
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
