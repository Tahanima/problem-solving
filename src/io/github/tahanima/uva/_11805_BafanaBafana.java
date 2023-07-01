package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11805_BafanaBafana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int P = scanner.nextInt();
            int answer = ((K + P) % N);

            if (answer == 0) {
                answer = N;
            }

            System.out.printf("Case %d: %d%n", i, answer);
        }
    }
}
