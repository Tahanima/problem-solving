package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author tahanima
 */
public class _10948_ThePrimaryProblem {
    static final int MAX = 2000005;
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
        int i = 0;
        int j = N - 1;

        while (i <= j) {
            int a = primes.get(i);
            int b = primes.get(j);

            if (a + b == n) {
                return (a + "+" + b);
            } else if (a + b > n){
                j--;
            } else {
                i++;
            }
        }

        return "NO WAY!";
    }

    public static void main(String[] args) {
        computePrimeNumbers();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            stringBuilder.append(n)
                    .append(":\n")
                    .append(getAnswer(n))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
