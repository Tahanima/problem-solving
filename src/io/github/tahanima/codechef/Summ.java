package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Summ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            System.out.printf("%s\n", ((scanner.nextInt() + scanner.nextInt()) == scanner.nextInt()) ? "YES" : "NO");
        }
    }
}
