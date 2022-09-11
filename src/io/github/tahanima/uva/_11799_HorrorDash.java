package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class _11799_HorrorDash {
    public static void main(String[] ags) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        for (int i = 1; i <= cases; i++) {
            int n = scanner.nextInt();
            int maxValue = scanner.nextInt();

            while (n-- > 1) {
                maxValue = Math.max(maxValue, scanner.nextInt());
            }

            stringBuilder.append("Case ")
                    .append(i)
                    .append(": ")
                    .append(maxValue)
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
