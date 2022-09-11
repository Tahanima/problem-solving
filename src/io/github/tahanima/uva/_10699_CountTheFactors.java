package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _10699_CountTheFactors {
    static final int MAX = 1000001;
    static final int[] countOfPrimeFactors = new int[MAX];

    public static void computePrimeFactors() {
        for (int i = 2; i < MAX; i++) {
            if (countOfPrimeFactors[i] == 0) {
                for (int j = i; j < MAX; j += i) {
                    countOfPrimeFactors[j]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        computePrimeFactors();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            stringBuilder.append(n)
                    .append(" : ")
                    .append(countOfPrimeFactors[n])
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
