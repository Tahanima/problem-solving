package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _13012_IdentifyingTea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String tea = scanner.nextLine().trim();
            String[] guess = scanner.nextLine().split(" ");
            int answer = 0;

            for (String guessedTea: guess) {
                if (guessedTea.equals(tea))
                    answer++;
            }

            System.out.println(answer);
        }
    }
}
