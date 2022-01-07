package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/07/2022
 */
public class _10055_HashmatTheBraveWarrior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(Math.abs(scanner.nextLong() - scanner.nextLong()))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
