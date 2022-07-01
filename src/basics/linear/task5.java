package basics.linear;

/* Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
   Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input time in seconds: ");
        int time = input.nextInt();
        input.close();

        if (time <= 0) {
            System.out.println("Please input positive integer ");
        } else {
            int H = time / 3600;
            int M = (time % 3600) / 60;
            int S = (time - H * 3600 - M * 60);

            System.out.println("Time in required format: " + H + "h " + M + "m " + S + "s");
        }
    }
}

