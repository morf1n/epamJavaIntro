package algorithmization.arrays;

/* Дан целочисленный массив с количеством элементов п. Сжать массив,
 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать. */

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        input.close();

        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");
        for (int i = 0; i < arrSize; i++) {
            numsArray[i] = (int) (-10 + Math.random() * 20);
            System.out.print(numsArray[i] + " ");
        }

        int a = (int) (Math.random() * 1000 + 1000); // generating random number to replace even elements

        for (int i = 1; i < numsArray.length; i++) { // replacing even elements
            if (i % 2 != 0) {
                numsArray[i] = a;
            }
        }

        int j = 0;
        for (int i = 0; i < numsArray.length - 1; i++) { // shifting odd elements backwards
            if (numsArray[i] == a) {
                numsArray[i - j] = numsArray[i + 1];
                j++;
            }
        }

        // filling free space with zeros
        boolean arrayDimensionIsEven = numsArray.length % 2 == 0;
        if (arrayDimensionIsEven) {
            for (int i = numsArray.length / 2; i < numsArray.length; i++) {
                numsArray[i] = 0;
            }
        } else {
            for (int i = numsArray.length / 2 + 1; i < numsArray.length; i++) {
                numsArray[i] = 0;
            }
        }

        System.out.print("\nFinal array: ");
        for (int i : numsArray) {
            System.out.print(i + " ");
        }
    }
}
