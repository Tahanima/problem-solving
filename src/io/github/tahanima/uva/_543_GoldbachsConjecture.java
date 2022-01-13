package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/14/2022
 */
public class _543_GoldbachsConjecture {
    final static int MAX = 1000005;
    final static ArrayList<Integer> primes = new ArrayList<>();

    public static void generatePrimes() {
        boolean[] prime = new boolean[MAX];
        int sqrt = (int) Math.sqrt(MAX);

        for (int i = 3; i < sqrt; i += 2) {
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

    public static String solve(int n) {
        int size = primes.size();
        int end = Collections.binarySearch(primes, n);

        if (end < 0) {
            end = - end - 1;
        }

        for (int i = 0, j = end; i <= j; ) {
            int a = primes.get(i);
            int b = primes.get(j);

            if (a + b == n) {
                return String.format("%d = %d + %d\n", n, a, b);
            } else if (a + b > n) {
                j--;
            } else {
                i++;
            }
        }

        return "";
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

            stringBuilder.append(solve(n));
        }

        System.out.print(stringBuilder);
    }
}
