package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 04/11/2022
 */
public class Atm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (k - num >= 0) {
                    stringBuilder.append(1);
                    k -= num;
                } else {
                    stringBuilder.append(0);
                }
            }

            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
