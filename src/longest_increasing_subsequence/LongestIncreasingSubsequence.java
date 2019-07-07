package longest_increasing_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        //input value
        Integer[] input={10,22,9,33,21,50,41,60};
        //tabulation
        Integer[] lis=new Integer[input.length];
        //initially all values are sub-sequence them self
        Arrays.fill(lis,1);

        for (int i = 1; i <input.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if (input[i]>input[j]){
                    lis[i]=Math.max(lis[i], lis[j]+1);
                }
            }
        }

        //size of LIS
        int longest=Collections.max(Arrays.asList(lis));
        System.out.println("LIS size: "+longest);

        //sequence
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(lis));
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = 1; i <=longest ; i++) {
            stringBuilder.append(input[arrayList.indexOf(i)]+" ");
        }
        System.out.println(stringBuilder.toString());



    }
}
