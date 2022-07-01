package algorithmization.arraysOfArrays;

/* Отсотрировать столбцы матрицы по возрастанию и убыванию значений элементов. */

import java.util.Scanner;

public class task13 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the dimension of the matrix: ");
        int dim = input.nextInt();

        int[][] matrix = new int[dim][dim];

        System.out.println("\nMatrix generated:\n=========");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = (int) (10 + Math.random() * 90);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========\n");

        boolean needsItr = true;

        System.out.print("Choose the type of sorting (1 - ascending, 2 - descending): ");
        int order = input.nextInt();

        switch (order) {
            case (1):
                for (int j = 0; j < dim; j++) {
                    while (needsItr) {
                        needsItr = false;
                        for (int i = 1; i < dim; i++) {
                            if (matrix[i][j] < matrix[i - 1][j]) {
                                int temp = matrix[i - 1][j];
                                matrix[i - 1][j] = matrix[i][j];
                                matrix[i][j] = temp;
                                needsItr = true;
                            }
                        }
                    }
                    needsItr = true;
                }
                break;

            case (2):
                for (int j = 0; j < dim; j++) {
                    while (needsItr) {
                        needsItr = false;
                        for (int i = 1; i < dim; i++) {
                            if (matrix[i][j] > matrix[i - 1][j]) {
                                int temp = matrix[i - 1][j];
                                matrix[i - 1][j] = matrix[i][j];
                                matrix[i][j] = temp;
                                needsItr = true;
                            }
                        }
                    }
                    needsItr = true;
                }
                break;
        }

        System.out.println("\nColumns sorted:\n=========");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========\n");
    }
}
