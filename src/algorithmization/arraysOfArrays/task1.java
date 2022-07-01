package algorithmization.arraysOfArrays;

/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. */

import java.util.Scanner;

public class task1 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the dimension of the matrix: ");
        int dim = input.nextInt();
        input.close();

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

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j = j + 2) {
                if (matrix[0][j] > matrix[dim - 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
