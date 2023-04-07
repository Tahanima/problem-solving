package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class CanDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            System.out.printf("%s\n", (scanner.nextInt() % 3 == 0) ? "YES" : "NO");
        }
    }
}
