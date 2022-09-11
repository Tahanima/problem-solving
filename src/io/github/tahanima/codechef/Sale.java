package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println(a + b + c - Math.min(a, Math.min(b, c)));
        }
    }
}
