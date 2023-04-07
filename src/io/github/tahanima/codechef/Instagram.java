package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Instagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            System.out.printf("%s\n", (X > 10 * Y) ? "YES" : "NO");
        }
    }
}
