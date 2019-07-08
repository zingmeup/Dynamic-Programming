package minimum_edit;

public class MinimumEdit {
    public static void main(String[] args) {
        String s1="CART";
        String s2="MARCH";

        int[][] edits=new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i <=s1.length() ; i++) {
            edits[i][0]=i;
        }
        for (int i = 0; i <=s2.length() ; i++) {
            edits[0][i]=i;
        }

        for (int i = 1; i <edits.length; i++) {
            for (int j = 1; j <edits[i].length ; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    edits[i][j]=edits[i-1][j-1];
                }else{
                    edits[i][j]=Math.min(edits[i-1][j-1], Math.min(edits[i][j-1],edits[i-1][j]))+1;
                }
            }
        }
        //tabulation
        for (int i = 0; i <edits.length; i++) {
            for (int j = 0; j <edits[i].length ; j++) {
                System.out.print(" "+edits[i][j]);
            }
            System.out.println();
        }
        System.out.println("Minimum edits: "+edits[s1.length()][s2.length()]);





    }
}
