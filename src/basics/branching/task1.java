package basics.branching;

/* Даны два угла треугольника (в градусах). Опеределить, существует ли такой треугольник,
   и если да, то будет ли он прямоугольным. */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first angle: ");
        double a = input.nextDouble();

        System.out.print("Input the second angle: ");
        double b = input.nextDouble();

        input.close();

        double c = 180 - a - b;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Such a triangle doesn't exist.");
        } else if (a == 90 ^ b == 90 ^ c == 90) {
            System.out.println("This triangle is rectangular");
        } else {
            System.out.println("Such a triangle exists, but it's not rectangular.");
        }
    }
}

