package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/26/2022
 */
public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int p = scanner.nextInt();

            System.out.printf("%s%n", (x * 3 + (n - x) * -1) >= p ? "PASS" : "FAIL");
        }
    }
}
