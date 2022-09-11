package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class _686_GoldbachsConjectureII {
    static final int MAX = 32770;
    static final ArrayList<Integer> primes = new ArrayList<>();

    public static void generatePrimes() {
        boolean[] prime = new boolean[MAX];
        int sqrt = (int) Math.sqrt(MAX);

        for (int i = 3; i <= sqrt; i += 2) {
            if (!prime[i]) {
                for (int j = i * i; j < MAX; j += i + i) {
                    prime[j] = true;
                }
            }
        }

        primes.add(2);
        for (int i = 3; i < MAX; i += 2) {
            if (!prime[i]) {
                primes.add(i);
            }
        }
    }

    public static int count(int n) {
        int answer = 0;
        int endIndex = Collections.binarySearch(primes, n);

        if (endIndex < 0) {
            endIndex = - endIndex - 1;
        }

        endIndex = Math.min(endIndex, primes.size() - 1);

        int i = 0;
        int j = endIndex;

        while (i <= j) {
            int a = primes.get(i);
            int b = primes.get(j);

            if (a + b == n) {
                answer++;
                i++; j--;
            } else if (a + b > n) {
                j--;
            } else {
                i++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        generatePrimes();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            stringBuilder.append(String.format("%d%n", count(n)));
        }

        System.out.print(stringBuilder);
    }
}
