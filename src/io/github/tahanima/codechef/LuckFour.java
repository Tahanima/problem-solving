package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/26/2022
 */
public class LuckFour {
    public static int noOfFours(int n) {
        int ans = 0;

        while (n > 0) {
            int r = n % 10;

            if (r == 4)
                ans++;

            n /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.println(noOfFours(scanner.nextInt()));
        }
    }
}
