package basics.cycles;

/* Напишите программу, где пользователь вводит любое целое положительное число.
   Программа суммирует все числа от 1 до введенного числа. */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input any positive integer : ");

        if (input.hasNextInt()) {

            int num = input.nextInt();
            input.close();

            if (num > 0) {
                int res = 0;
                for (int i = 1; i <= num; i++) {
                    res = res + i;
                }
                System.out.println("Result is: " + res);

            } else {
                System.out.println("Try again and input positive integer.");
            }
        } else {
            System.out.println("Try again and input positive integer.");
        }
    }
}
