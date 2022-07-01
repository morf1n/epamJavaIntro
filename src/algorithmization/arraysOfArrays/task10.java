package algorithmization.arraysOfArrays;

/* Найти положительные элементы главной диагонали квадратной матрицы. */

import java.util.Scanner;

public class task10 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the dimension of the matrix: ");
        int dim = input.nextInt();

        int[][] matrix = new int[dim][dim];

        System.out.println("\nMatrix generated:\n=========");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = (int) (-5 + Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========\n");

        for (int i = 0; i < dim; i++) {
            if (matrix[i][i] > 0) {
                System.out.printf("A[%d][%d] = %d\n", i + 1, i + 1, matrix[i][i]);
            }
        }
    }
}
