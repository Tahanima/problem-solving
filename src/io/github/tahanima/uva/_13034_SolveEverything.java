package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _13034_SolveEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();

        for (int i = 1; i <= S; i++) {
            boolean hasZero = false;

            for (int j = 1; j <= 13; j++) {
                hasZero |= (scanner.nextInt() == 0);
            }

            System.out.printf("Set #%d: %s%n", i, hasZero ? "No" : "Yes");
        }
    }
}
