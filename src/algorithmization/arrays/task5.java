package algorithmization.arrays;

/* Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi > i. */

import java.util.Scanner;

public class task5 {
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
        System.out.print("\n");

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] > i + 1) {
                System.out.printf("Number %d (index %d) fits to the condition.\n", numsArray[i], i + 1);
            }
        }
    }
}
