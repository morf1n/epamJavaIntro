package basics.linear;

/* Дано действительное число R вида nnn,ddd (три цифровых разряда в дробной и целой части).
   Поменять местами дробную и целую части числа и вывести полученное значение числа. */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input initial number in format nnn,ddd: ");
        double num = input.nextDouble();

        input.close();

        double temp = (int) num;

        double right = temp / 1000;
        double left = (num - temp) * 1000;

        double res = left + right;

        System.out.printf("Final number equals " + "%.3f", res);
    }
}
