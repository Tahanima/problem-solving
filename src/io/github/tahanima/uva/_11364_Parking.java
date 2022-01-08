package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/08/2022
 */
public class _11364_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        for (int i = 1; i <= cases; i++) {
            int n = scanner.nextInt();
            int minValue = 0;
            int maxValue = 0;

            for (int j = 0; j < n; j++) {
                int value = scanner.nextInt();

                if (j == 0) {
                    minValue = maxValue = value;
                } else {
                    minValue = Math.min(minValue, value);
                    maxValue = Math.max(maxValue, value);
                }
            }

            stringBuilder.append(2 * (maxValue - minValue))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
