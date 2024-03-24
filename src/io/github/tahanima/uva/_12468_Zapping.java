package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _12468_Zapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == -1 && b == -1) {
                break;
            }

            if (a > b) {
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
            }

            System.out.printf("%d\n", Math.min(b - a, a + (100 - b)));
        }
    }
}
