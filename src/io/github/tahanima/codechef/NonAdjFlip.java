package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class NonAdjFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            String binaryStr = scanner.next();
            boolean hasOne = binaryStr.charAt(0) == '1';
            boolean hasAdjOnes = false;

            for (int i = 1; i < n; i++) {
                if (binaryStr.charAt(i) == '1') {
                    hasOne = true;

                    if (binaryStr.charAt(i - 1) == '1')
                        hasAdjOnes = true;
                }
            }

            if (hasOne) {
                if (hasAdjOnes) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(0);
            }
        }
    }
}
