package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 04/05/2022
 */
public class BsCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            scanner.nextInt();
            int min = Math.min(scanner.nextInt(), scanner.nextInt());
            String binaryStr = scanner.next();

            boolean hasZero = false;
            boolean hasOne = false;

            for (char ch: binaryStr.toCharArray()) {
                if (ch == '0')
                    hasZero = true;
                else
                    hasOne = true;
            }

            if (hasOne && hasZero) {
                System.out.println(min);
            } else {
                System.out.println(0);
            }
        }
    }
}
