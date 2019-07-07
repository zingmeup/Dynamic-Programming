package longest_common_subsequence;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String a = "GXTXAYB";
        String b = "AGGTAB";
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        int[][] lcs = new int[A.length + 1][B.length + 1];

        for (int i = 0; i <=A.length ; i++) {
            for (int j = 0; j <=B.length ; j++) {
                if (i==0||j==0){
                    lcs[i][j]=0;
                }else if(A[i-1]==B[j-1]){
                    lcs[i][j]=lcs[i-1][j-1]+1;
                }else {
                    lcs[i][j]=Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        for (int i = 0; i <=A.length ; i++) {
            for (int j = 0; j <=B.length ; j++) {
                System.out.print(" "+lcs[i][j]);
            }
            System.out.println();
        }

        //longest length
        int longest=lcs[A.length][B.length];
        System.out.println(longest);

        //longest sequence
        StringBuilder stringBuilder=new StringBuilder();

    }
}
