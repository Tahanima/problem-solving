package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _13034SolveEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int max = 130;

            for (int j = 0; j < 13; j++) {
                max = Math.min(max, scanner.nextInt());
            }

            System.out.format("Set #%d: %s\n", i, max > 0 ? "Yes" : "No");
        }
    }
}
