package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/08/2022
 */
public class _11044_SearchingForNessy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        for (int i = 1; i <= cases; i++) {
            int n = (int) Math.ceil((scanner.nextInt() - 2) / 3.0);
            int m = (int) Math.ceil((scanner.nextInt() - 2) / 3.0);
            stringBuilder.append(n * m)
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}