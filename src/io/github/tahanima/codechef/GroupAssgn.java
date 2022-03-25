package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/25/2022
 */
public class GroupAssgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.printf("%d%n", (2 * scanner.nextInt() + 1) - scanner.nextInt());
        }
    }
}
