package basics.cycles;

/* Составить программу нахождения произведения квадратов первых двухсот чисел */

import java.math.*;

public class task4 {
    public static void main(String[] args) {

        BigDecimal res = BigDecimal.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            res = res.multiply(BigDecimal.valueOf(Math.pow(i, 2)));
        }
        System.out.printf("%.0f", res);
    }
}
