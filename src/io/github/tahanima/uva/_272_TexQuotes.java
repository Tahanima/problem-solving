package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _272_TexQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOpen = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            for (char ch: line.toCharArray()) {
                if (ch == '"') {
                    if (isOpen) {
                        System.out.print("''");
                        isOpen = false;
                    } else {
                        System.out.print("``");
                        isOpen = true;
                    }
                } else {
                    System.out.print(ch);
                }
            }

            System.out.println();
        }
    }
}
