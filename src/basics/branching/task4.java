package basics.branching;

/* Заданы размеры А, B прямоугольного отверстия и размеры x, y, z кирпича.
   Определить, пройдет ли кирпич через отверстие. */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input A: ");
        double A = input.nextDouble();

        System.out.print("Input B: ");
        double B = input.nextDouble();

        System.out.print("Input x: ");
        double x = input.nextDouble();

        System.out.print("Input y: ");
        double y = input.nextDouble();

        System.out.print("Input z: ");
        double z = input.nextDouble();

        input.close();

        if (A <= 0 || B <= 0 || x <= 0 || y <= 0 || z <= 0) {
            System.out.println("All numbers must be positive.");
        } else if (x <= A && y <= B
                || x <= B && y <= A
                || x <= A && z <= B
                || x <= B && z <= A
                || y <= A && z <= B
                || y <= B && z <= A) {
            System.out.println("Another Brick in the Wall.");
        } else {
            System.out.println("Doesn't fit.");
        }
    }
}
