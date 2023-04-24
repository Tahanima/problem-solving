package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class ProgLang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int A1 = scanner.nextInt();
            int B1 = scanner.nextInt();
            int A2 = scanner.nextInt();
            int B2 = scanner.nextInt();

            if (A > B) {
                A = A ^ B;
                B = A ^ B;
                A = A ^ B;
            }

            if (A1 > B1) {
                A1 = A1 ^ B1;
                B1 = A1 ^ B1;
                A1 = A1 ^ B1;
            }

            if (A2 > B2) {
                A2 = A2 ^ B2;
                B2 = A2 ^ B2;
                A2 = A2 ^ B2;
            }

            if (A == A1 && B == B1) {
                System.out.println(1);
            } else if (A == A2 && B == B2) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
