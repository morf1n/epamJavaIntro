package basics.cycles;

/* Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера. */

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many symbols do you want to see? ");

        if (input.hasNextInt()) {

            int n = input.nextInt();
            input.close();

            if (n > 0) {
                char symb;
                for (int i = 0; i <= n; i++) {
                    symb = (char) i;
                    System.out.printf("The ASCII value of %c is %d.\n", symb, i);
                }
            } else {
                System.out.println("Try again and input non-negative integer.");
            }
        } else {
            System.out.println("Please input non-negative integer.");
        }
    }
}
