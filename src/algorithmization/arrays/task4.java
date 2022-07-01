package algorithmization.arrays;

/* Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        input.close();

        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");
        for (int i = 0; i < arrSize; i++) {
            numsArray[i] = (int) (-100 + Math.random() * 200);
            System.out.print(numsArray[i] + " ");
        }

        int max = numsArray[0], min = numsArray[0];
        int maxInd = 0, minInd = 0;

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] > max) {
                max = numsArray[i];
                maxInd = i;
            }
            if (numsArray[i] < min) {
                min = numsArray[i];
                minInd = i;
            }
        }
        numsArray[maxInd] = min;
        numsArray[minInd] = max;

        System.out.printf("\nNumbers %d and %d with the indexes %d and %d were swapped.\n", min, max, ++minInd, ++maxInd);

        System.out.print("Final array: ");
        for (int i : numsArray) {
            System.out.print(i + " ");
        }
    }
}
