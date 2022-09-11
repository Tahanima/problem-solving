package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11614_EtruscanWarriorsNeverPlayChess {
    public static long findRow(long n) {
        return (-1 + (long) Math.sqrt(1.0 + 8 * n)) / 2L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        for (int i = 1; i <= cases; i++) {
            long n = scanner.nextLong();
            stringBuilder.append(findRow(n))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
