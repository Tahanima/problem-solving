package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Ageing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            System.out.println(scanner.nextInt() - 10);
        }
    }
}
