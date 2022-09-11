package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11172_RelationalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.printf("%c\n", (a < b) ? '<' : ((a > b) ? '>' : '='));
        }
    }
}
