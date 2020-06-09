package lec10;

// lexiography(dictionary)
import java.util.ArrayList;
import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
     String str="abc";
     int[] fre= freq(str);
        System.out.println(Arrays.toString(fre));
        permute("",fre,str.length());
    }
    public static int[] freq(String str){

//        char chh = '0';

        int[] ar = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            ar[ch-'a']++ ;
        }
//        for (int i = 0; i <ar.length ; i++) {
//            int max = ar[0];
//            if(max<ar[i]){
//                 chh = (char)(ar[i]+'a');
//            }
//        }
//        System.out.println("max occur character");
//        System.out.println(chh);
////        return ch;

       return ar ;
    }
    public static void permute(String process, int fre[], int length){
    if(length==0){
        System.out.println(process);
        return;
    }
        for (int i = 0; i <fre.length ; i++) {
            if (fre[i]>0) {
                fre[i]--;
                permute(process+(char)(i+'a'),fre,length-1);
                fre[i]++;
            }
//            if(i>2){
//                break;
//            } for debugging
        }
    }
}
