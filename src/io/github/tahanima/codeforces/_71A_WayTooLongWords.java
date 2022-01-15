package io.github.tahanima.codeforces;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 12/31/2021
 */
public class _71A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            String word = scanner.next();
            int len = word.length();

            System.out.printf("%s%n", len > 10 ? (word.charAt(0) + "" + (len - 2) + "" + word.charAt(len - 1)): word);
        }
    }
}
