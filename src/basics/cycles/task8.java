package basics.cycles;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        String a = input.next();

        System.out.print("Input the second number: ");
        String b = input.next();

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        for (int i = 0; i < aArr.length; i++) {
            char x = aArr[i];

            for (int j = 0; j < bArr.length; j++) {
                char y = bArr[j];

                if (x == y) {
                    System.out.print(x%10);

                }
            }
        }
    }
}
