package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class AgeLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int A = scanner.nextInt();

            System.out.printf("%s\n", (A >= X && A < Y) ? "YES" : "NO");
        }
    }
}
