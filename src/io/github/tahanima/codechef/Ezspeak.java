package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Ezspeak {
    private static boolean isEasy(int N, String S) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (Character.toString(S.charAt(i)).matches("[aeiou]")) {
                count = 0;
            } else {
                count++;
            }

            if (count >= 4) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            String S = scanner.next();

            System.out.printf("%s\n", isEasy(N, S) ? "YES" : "NO");
        }
    }
}
