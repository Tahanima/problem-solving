package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _12372_PackingForHoliday {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 1; i <= cases; i++) {
            int L = scanner.nextInt();
            int W = scanner.nextInt();
            int H = scanner.nextInt();

            boolean isOk = (L <= 20) && (W <= 20) && (H <= 20);

            System.out.printf("Case %d: %s%n", i, isOk ? "good" : "bad");
        }
    }
}
