package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 04/03/2022
 */
public class ThreeTopics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();

        boolean canWin = (x == a) || (x == b) || (x == c);
        System.out.printf("%s%n", canWin ? "Yes" : "No");
    }
}
