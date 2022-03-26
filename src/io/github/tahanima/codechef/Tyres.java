package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/26/2022
 */
public class Tyres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            n -= (n / 4) * 4;

            System.out.printf("%s%n", (n >= 2) ? "YES" : "NO");
        }
    }
}
