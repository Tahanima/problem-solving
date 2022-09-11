package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class Jassignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.printf("%s%n", scanner.nextInt() + 3 <= 10 ? "Yes" : "No");
        }
    }
}
