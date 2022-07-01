package basics.branching;

/*  Вычислить значение функции:
          {x^2 - 3x + 9, если x <= 3
    F(x)= {
          {1 / (x^3 + 6), если x > 3
 */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = input.nextDouble();

        input.close();

        double f;

        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("F(x) = " + f);
    }
}
