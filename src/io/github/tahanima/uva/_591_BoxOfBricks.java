package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/07/2022
 */
public class _591_BoxOfBricks {
    static final int MAX = 55;
    static final int[] height = new int[MAX];
    static final Scanner scanner = new Scanner(System.in);

    public static String solve(int n) {
        int perStackHeight = 0;
        int bricks = 0;

        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
            perStackHeight += height[i];
        }

        perStackHeight /= n;

        for (int i = 0; i < n; i++) {
            bricks += Math.abs(perStackHeight - height[i]);
        }

        return "The minimum number of moves is " + (bricks / 2) + ".";
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int testCase = 1;

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            stringBuilder.append(String.format("Set #%d%n%s%n%n", testCase++, solve(n)));
        }

        System.out.print(stringBuilder);
    }
}
