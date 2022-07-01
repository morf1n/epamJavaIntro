package basics.cycles;

/*  Вычислить значения функции на отрезке [a, b] с шагом h:
        {x, x > 2
    y = {
        {-x, x <= 2
 */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input h: ");
        double h = input.nextDouble();

        input.close();

        if (a > b) {
            System.out.println("\"b\" must be greater than \"a\".");
        }

        while (a <= 2 && a <= b) {
            double y = -a;
            System.out.printf("f(%f) = %f\n", a, y);
            a += h;
        }
        while (a > 2 && a <= b) {
            double y = a;
            System.out.printf("f(%f) = %f\n", a, y);
            a += h;
        }
    }
}
