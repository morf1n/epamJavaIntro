package algorithmization.arraysOfArrays;

/* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. */

import java.util.Scanner;

public class task2 {
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
            System.out.print(matrix[i][i] + " ");
        }
    }
}
