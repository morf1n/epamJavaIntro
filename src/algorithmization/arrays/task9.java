package algorithmization.arrays;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них */

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input array size: ");
        int arrSize = input.nextInt();
        input.close();

        int[] numsArray = new int[arrSize];

        System.out.print("Array generated: ");
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = (int) (-10 + Math.random() * 20);
            System.out.print(numsArray[i] + " ");
        }

        int match = 0, maxMatch = 0, res = 0;

        for (int i : numsArray) {     // compare each element
            for (int j : numsArray) { // to all the others
                if (i == j) { // if equals
                    match++;  // how many matches
                }
            }
            if (match > maxMatch) {
                maxMatch = match; // finding the case with maximum occurrences
                res = i;
            }
            if (match == maxMatch) {    // if different numbers occur the same (max) number of times
                res = Math.min(res, i); // finding minimum of them
            }
            match = 0;
        }
        System.out.println("\nThe most frequent number is " + res);
    }
}
