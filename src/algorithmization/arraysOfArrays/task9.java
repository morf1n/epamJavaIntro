package algorithmization.arraysOfArrays;

/* Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму. */

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the dimension of the matrix: ");
        int dim = input.nextInt();

        int[][] matrix = new int[dim][dim];

        System.out.println("\nMatrix generated:\n=========");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = (int) (10 + Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========\n");

        int columnSum = 0, maxSum = 0, maxSumInd = 0;

        for (int j = 0; j < dim; j++) {
            for (int i = 0; i < dim; i++) {
                columnSum += matrix[i][j];
            }
            System.out.printf("Sum of the column %d = %d.\n", j + 1, columnSum);
            if (columnSum > maxSum) {
                maxSum = columnSum;
                maxSumInd = j;
            }
            columnSum = 0;
        }
        System.out.printf("\nMaximum sum = %d (column #%d).\n", maxSum, maxSumInd + 1);
    }
}
