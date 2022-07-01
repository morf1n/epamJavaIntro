package algorithmization.arraysOfArrays;

/* Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I^2 - J^2) / N)
 * и подсчитать количество положительных элементов в ней. */

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the dimension of the matrix: ");
        int dim = input.nextInt();
        input.close();

        double[][] matrix = new double[dim][dim];
        int positiveCount = 0;

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = Math.sin((Math.pow(i + 1, 2) - Math.pow(j + 1, 2)) / dim);
            }
        }

        System.out.println("\nMatrix generated:\n=========");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("%.5f ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("=========\n");

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (matrix[i][j] > 0) {
                    positiveCount++;
                }
            }
        }

        System.out.println("Positive elements: " + positiveCount);
    }
}
