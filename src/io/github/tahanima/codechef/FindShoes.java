package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 04/03/2022
 */
public class FindShoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int m = Math.min(n, scanner.nextInt());

            System.out.println(n + (n - m));
        }
    }
}
