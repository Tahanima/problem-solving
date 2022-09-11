package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Blackjack {
    public static boolean between(int number, int start, int end) {
        return number >= start && number <= end;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = 21 - a - b;

            System.out.printf("%d%n", between(c, 1, 10) ? c : -1);
        }
    }
}
