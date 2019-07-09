package knapsack;

public class Knapsack01 {
    static int[] weight = {10,20,30};
    static int[] value =  {60,100,120};
    static int[][] memo=new int[weight.length+1][50+1];

    public static int knapsack(int n,  int c) {
        if (memo[n][c]!=0) return memo[n][c];
        if (n==0||c==0){
            return 0;
        }else if(weight[n]>c){
            return knapsack(n-1,c);
        }else{
            int result=Math.max(knapsack(n-1, c), value[n]+knapsack(n-1,c-weight[n]));
            memo[n][c]=result;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(knapsack(weight.length-1,50));

    }
}
