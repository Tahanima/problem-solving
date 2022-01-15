package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/14/2022
 */
public class _10924_PrimeWords {
    static final int MAX = 1050;
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

        primes.add(1);
        primes.add(2);
        for (int i = 3; i < MAX; i += 2) {
            if (!prime[i]) {
                primes.add(i);
            }
        }
    }

    public static int toInt(String number) {
        int answer = 0;

        for (char ch: number.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                answer += ch - 'a' + 1;
            } else {
                answer += ch - 'A' + 27;
            }
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        return Collections.binarySearch(primes, n) >= 0;
    }

    public static void main(String[] args) {
        generatePrimes();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append((isPrime(toInt(scanner.next()))) ? "It is a prime word.\n" : "It is not a prime word.\n");
        }

        System.out.print(stringBuilder);
    }
}
