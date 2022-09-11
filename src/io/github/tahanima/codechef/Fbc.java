package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class Fbc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.printf("%s%n", scanner.nextInt() - scanner.nextInt());
        }
    }
}
