package io.github.tahanima.uva;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class _12250_LanguageDetection {
    public static void main(String[] args) {
        HashMap<String, String> mapping = new HashMap<>();
        mapping.put("HELLO", "ENGLISH");
        mapping.put("HOLA", "SPANISH");
        mapping.put("HALLO", "GERMAN");
        mapping.put("BONJOUR", "FRENCH");
        mapping.put("CIAO", "ITALIAN");
        mapping.put("ZDRAVSTVUJTE", "RUSSIAN");

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = 1;

        while (scanner.hasNext()) {
            String word = scanner.next();

            if (word.equals("#")) {
                break;
            }

            stringBuilder.append("Case ")
                    .append(testCases++)
                    .append(": ")
                    .append(mapping.getOrDefault(word, "UNKNOWN"))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
