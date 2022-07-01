package algorithmization.arrays;

/* Задана последовательность N вещественных чисел.
 *  Вычислить сумму чисел, порядковые номера которых являются простыми числами */

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        input.close();

        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = (int) (-10 + Math.random() * 20);
            System.out.print(numsArray[i] + " ");
        }

        int res = 0;

        for (int i = 0; i <= numsArray.length; i++) {
            boolean isPrime = i > 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("\n%d'th element = %d", i, numsArray[i - 1]);
                res += numsArray[i - 1];
            }
        }
        System.out.println("\n\nResult: " + res);
    }
}
