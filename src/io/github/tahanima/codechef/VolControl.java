package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class VolControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            System.out.println(Math.abs(scanner.nextInt() - scanner.nextInt()));
        }
    }
}
