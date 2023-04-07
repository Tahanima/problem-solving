package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class OneMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int X = scanner.nextInt();

            System.out.printf("%s\n", X > 24 ? "YES" : "NO");
        }
    }
}
