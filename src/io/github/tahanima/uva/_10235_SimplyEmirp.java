package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/14/2022
 */
public class _10235_SimplyEmirp {
    final static int MAX = 1000005;
    final static ArrayList<Integer> primes = new ArrayList<>();

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

    public static int reverse(int n) {
        int m = 0;

        while (n > 0) {
            m *= 10;
            m += n % 10;
            n /= 10;
        }

        return m;
    }

    public static boolean isPrime(int n) {
        return Collections.binarySearch(primes, n) >= 0;
    }

    public static boolean isEmirp(int n) {
        int reverseOfN = reverse(n);
        
        return isPrime(n) && isPrime(reverseOfN) && (n != reverseOfN);
    }

    public static void main(String[] args) {
        generatePrimes();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (isEmirp(n)) {
                stringBuilder.append(String.format("%d is emirp.\n", n));
            } else if (isPrime(n)) {
                stringBuilder.append(String.format("%d is prime.\n", n));
            } else {
                stringBuilder.append(String.format("%d is not prime.\n", n));
            }
        }

        System.out.print(stringBuilder);
    }
}
