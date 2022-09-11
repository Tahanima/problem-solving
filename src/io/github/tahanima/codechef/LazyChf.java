package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class LazyChf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int x = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();

            System.out.println(Math.min(x * m, x + d));
        }
    }
}
