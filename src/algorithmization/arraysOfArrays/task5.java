package algorithmization.arraysOfArrays;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
 *     (  1   1   1  ... 1   1   1 )
 *     (  2   2   2  ... 2   2   0 )
 *     (  3   3   3  ... 3   0   0 )
 *     (  .   .   .  ... .   .   . )
 *     ( n-1 n-1  0  ... 0   0   0 )
 *     (  n   0   0  ... 0   0   0 ) */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the [even] dimension of the matrix: ");
        int dim = input.nextInt();
        input.close();

        if (dim % 2 != 0) {
            System.out.println("Dimension is incorrect.");
        } else {

            int[][] matrix = new int[dim][dim];
            int n = dim;

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = i + 1;
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