package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/09/2022
 */
public class _12403_SaveSetu {
    public static void main(String[] ags) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();
        int total = 0;

        while (cases-- > 0) {
            if (scanner.next().equals("donate")) {
                total += scanner.nextInt();
            } else {
                stringBuilder.append(total)
                        .append("\n");
            }
        }

        System.out.print(stringBuilder);
    }
}
