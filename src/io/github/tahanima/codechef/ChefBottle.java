package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class ChefBottle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int k = scanner.nextInt();

            System.out.println(Math.min(n, k / x));
        }
    }
}
