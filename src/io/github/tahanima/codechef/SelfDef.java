package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class SelfDef {
    public static boolean between(int number, int start, int end) {
        return number >= start && number <= end;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int ans = 0;

            while (n-- > 0) {
                if (between(scanner.nextInt(), 10, 60))
                    ans++;
            }

            System.out.println(ans);
        }
    }
}
