package algorithmization.arraysOfArrays;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
 *     ( 1   2   3   ... n )
 *     ( n  n-1 n-2  ... 1 )
 *     ( 1   2   3   ... n )
 *     ( n  n-1 n-2  ... 1 )
 *     ( .   .   .   ... . )
 *     ( n  n-1 n-2  ... 1 ) */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the [even] dimension of the matrix: ");
        int dim = input.nextInt();
        input.close();

        if (dim % 2 != 0) {
            System.out.println("Dimension is incorrect.");
        } else {

            int[][] matrix = new int[dim][dim];

            System.out.println("\nMatrix generated:\n=========");
            for (int i = 0; i < dim; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < dim; j++) {
                        matrix[i][j] = j + 1;
                        System.out.print(matrix[i][j] + " ");
                    }
                } else {
                    for (int j = 0; j < dim; j++) {
                        matrix[i][j] = dim - j;
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("=========\n");
        }
    }
}
