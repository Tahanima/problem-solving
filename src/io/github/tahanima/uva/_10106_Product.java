package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/15/2022
 */
public class _10106_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextBigInteger().multiply(scanner.nextBigInteger()))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
