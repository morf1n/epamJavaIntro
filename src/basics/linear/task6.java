package basics.linear;

/* Для данной области составить линейную программу, которая печатает true,
   если точка с координатами (x, y) принадлежит закрашенной области, и false - в противном случае. */

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = input.nextDouble();

        System.out.print("Input y: ");
        double y = input.nextDouble();

        input.close();

        System.out.println((y <= 4 && y >= 0 && Math.abs(x) <= 2) || (y <= 0 && y >= -3 && Math.abs(x) <= 4));
    }
}
