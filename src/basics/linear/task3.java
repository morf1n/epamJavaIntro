package basics.linear;

/* Вычислить значение выражения по формуле
   (все переменные принимают действительные значения):
   (sin x + cos y)/ (cos x - sin y) * tg xy. */

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = input.nextDouble();

        System.out.print("Input y: ");
        double y = input.nextDouble();

        input.close();

        double f = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Function equals: " + f);
    }
}
