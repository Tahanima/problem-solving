package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11764_JumpingMario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            int previous = scanner.nextInt();
            int high = 0;
            int low = 0;

            for (int j = 0; j < N - 1; j++) {
                int current = scanner.nextInt();

                if (current > previous) {
                    high++;
                } else if (current < previous) {
                    low++;
                }

                previous = current;
            }

            System.out.printf("Case %d: %d %d\n", i, high, low);
        }
    }
}
