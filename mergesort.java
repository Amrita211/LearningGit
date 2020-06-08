package lec11;

import lec6.util;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[]ar = {2,4,6,1,7,8,3};
        System.out.println(Arrays.toString(divide(ar)));
    }
    public static int[] divide(int[] ar){
        if(ar.length==1){
            return ar;
        }
    int mid = ar.length/2;
    int[] first = divide(Arrays.copyOfRange(ar,0,mid));
    int[] sec = divide(Arrays.copyOfRange(ar,mid,ar.length));
    return merge(first,sec);
    }
    public static int[] merge(int first[], int[] sec){
        int[] mix= new int[first.length+sec.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<sec.length){
            if(sec[j]<first[i]){

                mix[k]=sec[j];
                j++;
                k++;
            }
            else{
                mix[k]=first[i];
                i++;
                k++;
            }


        }
        while(i<first.length){
         mix[k]=first[i];
         i++;
         k++;
        }
        while(j<sec.length){
            mix[k]= sec[j];
            j++;
            k++;
        }
                return mix;
    }

}
