package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/02/2022
 */
public class _10394_TwinPrimes {
    final static int MAX = 20000001;
    final static ArrayList<Pair> twinPrimes = new ArrayList<>();

    final static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void computeTwinPrimes() {
        final boolean[] prime = new boolean[MAX];
        int sqrt = (int)Math.sqrt(MAX);

        for (int i = 3; i <= sqrt; i += 2) {
            if (!prime[i]) {
                for (int j = i * i; j < MAX; j += (i + i)) {
                    prime[j] = true;
                }
            }
        }

        int previous = 2;

        for (int i = 3; i < MAX; i += 2) {
            if (!prime[i]) {
                if (i == (previous + 2)) {
                    twinPrimes.add(new Pair(previous, i));
                }

                previous = i;
            }
        }
    }

    public static void main(String[] args) {
        computeTwinPrimes();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            stringBuilder.append("(")
                    .append(twinPrimes.get(n - 1).first)
                    .append(", ")
                    .append(twinPrimes.get(n - 1).second)
                    .append(")\n");
        }

        System.out.print(stringBuilder);
    }
}
