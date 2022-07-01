package algorithmization.arraysOfArrays;

/* Сформировать случайную матрицу mxn, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца. */

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the dimension of the matrix\nm (strings) =  ");
        int m = input.nextInt();
        System.out.print("n (columns) =  ");
        int n = input.nextInt();

        int[][] matrix = new int[m][n];
        int onesCount = 0;

        if (n > m) {
            System.out.println("Impossible to build the required matrix.");
        } else {
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 1;
                    onesCount++;
                    if (onesCount == j + 1) {
                        break;
                    }
                }
                onesCount = 0;
            }
            System.out.println("\nMatrix generated:\n=========");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("=========\n");
        }
    }
}
