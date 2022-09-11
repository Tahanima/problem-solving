package io.github.tahanima.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author tahanima
 */
public class _10168_SummationOfFourPrimes {
    static final int MAX = 10000001;
    static final ArrayList<Integer> primes = new ArrayList<>();

    static int N;

    public static void computePrimeNumbers() {
        final boolean[] prime = new boolean[MAX];
        int sqrt = (int) Math.sqrt(MAX);
        primes.add(2);

        for (int i = 3; i <= sqrt; i += 2) {
            if (!prime[i]) {
                for (int j = i * i; j < MAX; j += (i + i)) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 3; i < MAX; i += 2) {
            if (!prime[i]) {
                primes.add(i);
            }
        }

        N = primes.size();
    }

    public static String getAnswer(int n) {
        String prefix;

        if (n % 2 == 0) {
            n -= 4;
            prefix = "2 2 ";
        } else {
            n -= 5;
            prefix = "2 3 ";
        }

        int upperBoundIndex = Collections.binarySearch(primes, n);

        if (upperBoundIndex < 0) {
            upperBoundIndex = -(upperBoundIndex + 1);

            if (upperBoundIndex == N) {
                upperBoundIndex--;
            }
        }

        int i = 0;
        int j = upperBoundIndex;

        while (i <= j) {
            int a = primes.get(i);
            int b = primes.get(j);

            if (a + b == n) {
                return prefix + a + " " + b;
            } else if (a + b > n) {
                j--;
            } else {
                i++;
            }
        }

        return "Impossible.";
    }

    public static void main(String[] args) throws IOException {
        computePrimeNumbers();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            int n = Integer.parseInt(line.trim());

            if (n < 8) {
                stringBuilder.append("Impossible.\n");
            } else {
                stringBuilder.append(getAnswer(n))
                        .append("\n");
            }
        }

        System.out.print(stringBuilder);
    }
}
