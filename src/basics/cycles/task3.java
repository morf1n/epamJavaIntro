package basics.cycles;

/* Найти сумму квадратов первых ста чисел. */

public class task3 {
    public static void main(String[] args) {

        int res = 0;

        for (int i = 1; i <= 100; i++) {
            res += Math.pow(i, 2);
        }
        System.out.println(res);
    }
}
