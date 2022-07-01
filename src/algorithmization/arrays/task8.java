package algorithmization.arrays;

/* Дана  последовательность  целых  чисел a1, a2, ..., an.  Образовать  новую  последовательность,
 * выбросив из исходной те члены, которые равны min(a1, a2, ..., an) */

import java.util.Scanner;

public class task8 {
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

        int min = numsArray[0];

        // searching for min number
        for (int i : numsArray) {
            if (i < min) {
                min = i;
            }
        }

        // how many occurrences of min number in the array?
        int minCount = 0;
        for (int i : numsArray) {
            if (i == min) {
                minCount++;
            }
        }

        int[] finalArray = new int[numsArray.length - minCount];
        int finalArrayInd = 0;

        for (int i : numsArray) {
            if (i != min) {
                finalArray[finalArrayInd] = i;
                finalArrayInd++;
            }
        }

        System.out.print("\nFinal array: ");
        for (int j : finalArray) {
            System.out.print(j + " ");
        }
    }
}
