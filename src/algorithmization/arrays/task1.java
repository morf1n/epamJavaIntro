package algorithmization.arrays;

/* В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");

        for (int i = 0; i < arrSize; i++) {
            numsArray[i] = (int) (Math.random() * 100);
            System.out.print(numsArray[i] + " ");
        }

        System.out.print("\nPlease input K: ");
        int K = input.nextInt();
        input.close();

        int res = 0;

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] % K == 0) {
                res += numsArray[i];
            }
        }
        System.out.println("Result: " + res);
    }

}