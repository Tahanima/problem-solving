package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class _1124_CelebrityJeopardy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(String.format("%s%n", scanner.nextLine()));
        }

        System.out.print(stringBuilder);
    }
}
