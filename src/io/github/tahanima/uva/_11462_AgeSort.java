package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/11/2022
 */
public class _11462_AgeSort {
    final static int MAX = 105;
    final static int[] ageFrequency = new int[MAX];

    public static void clear() {
        for (int i = 0; i < MAX; i++) {
            ageFrequency[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0)
                break;

            for (int i = 0; i < n; i++) {
                ageFrequency[scanner.nextInt()]++;
            }

            boolean isFirst = true;
            for (int i = 1; i <= 100; i++) {
                for (int j = 1; j <= ageFrequency[i]; j++) {
                    if (!isFirst)
                        stringBuilder.append(" ");

                    stringBuilder.append(i);
                    isFirst = false;
                }
            }

            stringBuilder.append("\n");
            clear();
        }

        System.out.print(stringBuilder);
    }
}
