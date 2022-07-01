package basics.branching;

/* Найти max{min(a, b), min(c, d)} */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input c: ");
        double c = input.nextDouble();

        System.out.print("Input d: ");
        double d = input.nextDouble();

        input.close();

        System.out.println("max{min(a,b),min(c,d)} = " + Math.max(Math.min(a, b), Math.min(c, d)));

    }
}
