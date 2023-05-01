package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Creds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            scanner.nextInt();

            System.out.println(4 * X + 2 * Y);
        }
    }
}
