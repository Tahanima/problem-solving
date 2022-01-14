package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/15/2022
 */
public class _10945_MotherBear {
    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (!Character.isLetter(word.charAt(i))) {
                i++;
            } else if (!Character.isLetter(word.charAt(j))) {
                j--;
            } else {
                if (word.charAt(i) != word.charAt(j))
                    return false;

                i++; j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();

            if (word.equals("DONE"))
                break;

            stringBuilder.append(String.format("%s%n", isPalindrome(word.toLowerCase()) ? "You won't be eaten!" : "Uh oh.."));
        }

        System.out.print(stringBuilder);
    }
}
