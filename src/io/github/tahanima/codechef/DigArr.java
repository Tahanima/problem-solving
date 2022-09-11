package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class DigArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            boolean canBeMultipleOfFive = false;
            scanner.nextInt();
            String num = scanner.next();

            for (char ch : num.toCharArray()) {
                canBeMultipleOfFive |= (ch == '0') || (ch == '5');
            }

            System.out.printf("%s%n", canBeMultipleOfFive ? "Yes" : "No");
        }
    }
}
