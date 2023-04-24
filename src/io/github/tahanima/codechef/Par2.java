package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Par2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();

            System.out.printf("%s\n", ((N & 1) == 0) ? "Yes" : "No");
        }
    }
}
