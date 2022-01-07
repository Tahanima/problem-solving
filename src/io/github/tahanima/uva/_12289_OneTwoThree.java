package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/08/2022
 */
public class _12289_OneTwoThree {
    public static boolean isOne(String word) {
        String one = "one";
        int noOfMismatch = 0;

        for (int i = 0; i < 3; i++) {
            if (word.charAt(i) != one.charAt(i))
                noOfMismatch++;
        }

        return noOfMismatch <= 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            String word = scanner.next();

            stringBuilder.append(word.length() == 5 ? 3 : (isOne(word) ? 1 : 2))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
