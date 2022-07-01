package basics.cycles;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
   Общий член ряда имеет вид: an = 1 / 2^n + 1 / 3^n; */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input index of the first element of the series: ");
        int n = input.nextInt();

        System.out.print("Input index of the last element of the series: ");
        int nlast = input.nextInt();

        System.out.print("Input e: ");
        double e = input.nextDouble();

        input.close();

        double res = 0;

        while (n != nlast) {
            double an = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (Math.abs(an) >= e) {
                System.out.printf("For n = %d - an = %f.\n", n, Math.abs(an));
                res += an;
            }
            n++;
        }
        System.out.println("Result = " + res);
    }
}