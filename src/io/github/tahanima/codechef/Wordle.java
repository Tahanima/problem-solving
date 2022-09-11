package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class Wordle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            String s = scanner.next();
            String t = scanner.next();
            StringBuilder ans = new StringBuilder();
            int len = s.length();

            for (int i = 0; i < len; i++) {
                ans.append(String.format("%c", s.charAt(i) == t.charAt(i) ? 'G' : 'B'));
            }

            System.out.println(ans);
        }
    }
}
