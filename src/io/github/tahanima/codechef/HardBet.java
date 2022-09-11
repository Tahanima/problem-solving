package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class HardBet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int min = Math.min(a, Math.min(b, c));

            System.out.printf("%s%n", (c == min) ? "Alice" : ((b == min) ? "Bob" : "Draw"));
        }
    }
}
