package algorithmization.arraysOfArrays;

/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы. */

import java.util.Scanner;

public class task3 {
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

        System.out.print("Please input k (string): ");
        int k = input.nextInt();
        System.out.print("Please input p (column): ");
        int p = input.nextInt();
        input.close();

        System.out.printf("\nString %d: ", k);
        for (int i = 0; i < dim; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }

        System.out.printf("\n\nColumn %d:\n", p);
        for (int i = 0; i < dim; i++) {
            System.out.println(matrix[i][p - 1]);
        }
    }
}
