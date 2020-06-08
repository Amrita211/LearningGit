package lec11;

import lec6.util;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
      int[] ar = {2,4,5,1,7,8,5};
        quick(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));
    }
    public static void quick(int[] ar, int start, int end){
//        int start = 0;
//        int end = ar.length-1;
        if(start>=end){
            return;
        }
        int pivot = end-1;
        pivot = pivotchange(ar, start,pivot);
        quick(ar,start,pivot);
        quick(ar,pivot+1,end);

    }
    public static int pivotchange(int ar[], int start,int pivot){
        int j= start;
        for (int i = start; i < pivot ; i++) {
            if(ar[i]<ar[pivot]){
                util.swap(ar,i,j);
                j++;
            }
        }
        util.swap(ar,j,pivot);
        return j;
    }
}
