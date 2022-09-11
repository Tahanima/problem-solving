package io.github.tahanima.uva;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class _401_Palindromes {
    public static boolean isPalindrome(String word) {
        int n = word.length();

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j))
                return false;
        }

        return true;
    }

    public static boolean isMirroredString(String word, HashMap<Character, Character> map) {
        int n = word.length();

        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            if (map.containsKey(word.charAt(i))) {
                char a = map.get(word.charAt(i));

                if (a != word.charAt(j))
                    return false;
            } else if (map.containsKey(word.charAt(j))) {
                char a = map.get(word.charAt(j));

                if (a != word.charAt(i))
                    return false;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('A', 'A');
        map.put('E', '3');
        map.put('H', 'H');
        map.put('I', 'I');
        map.put('J', 'L');
        map.put('M', 'M');
        map.put('O', 'O');
        map.put('S', '2');
        map.put('T', 'T');
        map.put('U', 'U');
        map.put('V', 'V');
        map.put('W', 'W');
        map.put('X', 'X');
        map.put('Y', 'Y');
        map.put('Z', '5');
        map.put('1', '1');
        map.put('8', '8');

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            String word = scanner.next();
            boolean isPali = isPalindrome(word);
            boolean isMirroredStr = isMirroredString(word, map);

            if (isPali && isMirroredStr) {
                stringBuilder.append(String.format("%s -- is a mirrored palindrome.%n%n", word));
            } else if (isPali) {
                stringBuilder.append(String.format("%s -- is a regular palindrome.%n%n", word));
            } else if (isMirroredStr) {
                stringBuilder.append(String.format("%s -- is a mirrored string.%n%n", word));
            } else {
                stringBuilder.append(String.format("%s -- is not a palindrome.%n%n", word));
            }
        }

        System.out.print(stringBuilder);
    }
}
