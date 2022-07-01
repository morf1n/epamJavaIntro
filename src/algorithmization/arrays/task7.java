package algorithmization.arrays;

/* Даны действительные числа a1, a2, ..., a(n).
 *  Найти max(a1 + a(n), a2 + a(n-1), ..., a(n/2-1) + a(n/2+1)) */

import java.util.Scanner;

public class task7 {
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

        int maxSum = -19; // in case all sums appear to be negative

        System.out.printf("\nnumsArray.length = %d.\n", numsArray.length );

        for (int i = 0; i < numsArray.length / 2; i++) {
            int sum = numsArray[i] + numsArray[numsArray.length - 1 - i];
            System.out.printf("\n(%d) + (%d) = %d", numsArray[i], numsArray[numsArray.length - 1 - i], sum);

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("\n\nMaximum sum = " + maxSum);
    }
}
