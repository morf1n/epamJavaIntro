package algorithmization.arraysOfArrays;

/* В числовой матрице поменять местами два любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 * а элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры. */

import java.util.Scanner;

public class task8 {
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

        System.out.print("Enter the number of the column you want to switch: ");
        int col1 = input.nextInt();
        System.out.print("Enter the number of the column you want to switch: ");
        int col2 = input.nextInt();

        for (int i = 0; i < dim; i++) {
            int tmp = matrix[i][col1 - 1];
            matrix[i][col1 - 1] = matrix[i][col2 - 1];
            matrix[i][col2 - 1] = tmp;
        }

        System.out.println("\nMatrix changed:\n=========");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========\n");
    }
}
