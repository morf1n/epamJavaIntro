package algorithmization.arraysOfArrays;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
 *     ( 1   1   1  ... 1   1   1 )
 *     ( 0   1   1  ... 1   1   0 )
 *     ( 0   0   1  ... 1   0   0 )
 *     ( .   .   .  ... .   .   . )
 *     ( 0   1   1  ... 1   1   0 )
 *     ( 1   1   1  ... 1   1   1 ) */

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the [even] dimension of the matrix: ");
        int dim = input.nextInt();
        input.close();

        if (dim % 2 != 0) {
            System.out.println("Dimension is incorrect.");
        } else {

            int[][] matrix = new int[dim][dim];
            int n = 0;

            for (int i = 0; i < dim / 2; i++) {
                for (int j = n; j < dim - n; j++) {
                    matrix[i][j] = 1;
                }
                n++;
            }

            for (int i = dim / 2; i <= dim; i++) {
                for (int j = n; j < dim - n; j++) {
                    matrix[i - 1][j] = 1;
                }
                n--;
            }

            System.out.println("\nMatrix generated:\n=========");
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("=========\n");
        }
    }
}