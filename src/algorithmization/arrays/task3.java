package algorithmization.arrays;

/* Дан  массив  действительных  чисел,  размерность  которого N.
 *  Подсчитать, сколько  в  нем  отрицательных, положительных и нулевых элементов */

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        input.close();

        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");

        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = (int) (-100 + Math.random() * 200);
            System.out.print(numsArray[i] + " ");
        }

        int positive = 0, negative = 0, zeros = 0;
        for (int i : numsArray) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println("\nPositive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
