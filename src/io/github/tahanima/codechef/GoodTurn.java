package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class GoodTurn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int sum = scanner.nextInt() + scanner.nextInt();

            System.out.printf("%s\n", sum > 6 ? "YES": "NO");
        }
    }
}
