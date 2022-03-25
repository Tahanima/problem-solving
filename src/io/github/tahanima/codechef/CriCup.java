package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/25/2022
 */
public class CriCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.printf("%s%n", Math.abs(scanner.nextInt() - scanner.nextInt()) <= scanner.nextInt() ? "YES" : "NO");
        }
    }
}
