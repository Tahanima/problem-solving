package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _12577_HajjEAkbar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = 1;

        while (scanner.hasNext()) {
            String word = scanner.next();

            if (word.equals("*")) {
                break;
            }

            stringBuilder.append("Case ")
                    .append(testCases++)
                    .append(": ")
                    .append(word.equals("Hajj") ? "Hajj-e-Akbar" : "Hajj-e-Asghar")
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
