package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class TaxSaving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            System.out.println(Math.max(0, X - Y));
        }
    }
}
