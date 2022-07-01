package algorithmization.arrays;

/* Дана последовательность действительных чисел a1,a2,...,an.
 * Заменить все её члены, большие данного Z, этим числом.
 * Подсчитать количество замен */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");

        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = (int) (-100 + Math.random() * 200);
            System.out.print(numsArray[i] + " ");
        }

        System.out.print("\nInput Z: ");
        int Z = input.nextInt();
        input.close();

        int rep = 0;

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] > Z) {
                numsArray[i] = Z;
                rep++;
            }
        }

        System.out.print("Final array: ");

        for (int i : numsArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nReplacements: " + rep);
    }
}
