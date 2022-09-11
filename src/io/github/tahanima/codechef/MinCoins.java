package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class MinCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int amount = scanner.nextInt();

            if (amount % 5 != 0) {
                System.out.println(-1);
            } else {
                int answer = amount / 10;
                amount -= 10 * answer;
                answer += amount / 5;

                System.out.printf("%d%n", answer);
            }
        }
    }
}
