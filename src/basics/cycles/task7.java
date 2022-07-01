package basics.cycles;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
  m и n вводятся с клавиатуры. */

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input m: ");
        int m = input.nextInt();

        System.out.print("Input n: ");
        int n = input.nextInt();

        input.close();

        if (m <= 0 || n <= 0 || m > n) {
            System.out.println("Both numbers must be positive and \"n\" must be greater than \"m\".");
        } else {
            int div;

            while (m != n) {
                int j = 2;
                while (j != (m - 1)) {
                    if (m % j == 0) {
                        div = m / j;
                        System.out.printf("For %d divider is: %d.\n", m, div);
                    }
                    j++;
                }
                System.out.println();
                m++;
            }
        }
    }
}
