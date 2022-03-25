package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/25/2022
 */
public class Nibble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.printf("%s%n", (scanner.nextInt() % 4) == 0 ? "Good" : "Not Good");
        }
    }
}
