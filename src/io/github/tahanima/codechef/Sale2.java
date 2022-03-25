package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/25/2022
 */
public class Sale2 {
    private static int solve(int n) {
        if (n == 1)
            return 1;
        else {
            int ans = 0;

            ans += (n % 3 == 0) ? 0 : 1;
            ans += solve(n - 1);

            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            System.out.println(solve(n) * x);
        }
    }
}
