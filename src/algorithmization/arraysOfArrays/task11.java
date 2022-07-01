package algorithmization.arraysOfArrays;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. */

public class task11 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][20];

        System.out.println("\nMatrix generated:\n=========");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========\n");

        int strCount = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    strCount++;
                }
                if (strCount == 3) {
                    System.out.printf("String #%d contains 3 or more 5's.\n", i + 1);
                    break;
                }
            }
            strCount = 0;
        }
    }
}
