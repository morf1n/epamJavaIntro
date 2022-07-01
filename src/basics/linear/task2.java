package basics.linear;

/* Вычислить значение выражения по формуле
   (все переменные принимают действительные значения):
   b + sqrt(b^2 + 4ac)/2a - a^3c + b^-2. */

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

        input.close();

        double f = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Function equals " + f);
    }
}
