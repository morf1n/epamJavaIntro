package basics.linear;

/*Найдите значение функции: z = ((a - 3) * b / 2) + c */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input c: ");
        double c = input.nextDouble();

        input.close();

        double z = ((a - 3) * b / 2) + c;

        System.out.println("z = " + z);
    }
}
