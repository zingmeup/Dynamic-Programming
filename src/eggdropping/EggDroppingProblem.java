package eggdropping;

public class EggDroppingProblem {

    static int eggDrop(int n, int k) {
        if (k == 1 || k == 0)
            return k;
        if (n == 1)
            return k;

        int min = Integer.MAX_VALUE, x, res;

        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1), eggDrop(n, k - x));
            if (res < min)
                min = res;
        }
        return min + 1;
    }

    public static void main(String[] args) {
        System.out.println(eggDrop(2, 10));
    }
}
