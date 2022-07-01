package basics.branching;

/* Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
   Определить, будут ли они расположены на одной прямой. */

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input x1: ");
        double x1 = input.nextDouble();

        System.out.print("Input y1: ");
        double y1 = input.nextDouble();

        System.out.print("Input x2: ");
        double x2 = input.nextDouble();

        System.out.print("Input y2: ");
        double y2 = input.nextDouble();

        System.out.print("Input x3: ");
        double x3 = input.nextDouble();

        System.out.print("Input y3: ");
        double y3 = input.nextDouble();

        input.close();

        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
            System.out.println("Points lie on the same line");
        } else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Points lie on the same line");
        } else {
            System.out.println("Points don't lie on the same line");
        }
    }
}
