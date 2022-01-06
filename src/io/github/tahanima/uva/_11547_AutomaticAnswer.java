package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/07/2022
 */
public class _11547_AutomaticAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        for (int i = 1; i <= cases; i++) {
            int n = scanner.nextInt();
            n = ((((((n * 567) / 9) + 7492) * 235) / 47) - 498) / 10;

            if (n < 0)
                n *= -1;

            stringBuilder.append(n % 10)
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
