package io.github.tahanima.codeforces;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _1A_TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long a = scanner.nextInt();

        long ans = (n / a) + (n % a == 0 ? 0 : 1);
        ans *= ((m / a) + (m % a == 0 ? 0 : 1));

        System.out.println(ans);
    }
}
