package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class _10324_ZerosAndOnes {
    static final int MAX = 1000005;
    static final int[] countOfOnes = new int[MAX];

    public static void prepare(String binary) {
        int size = binary.length();

        for (int i = 0; i < size; i++) {
            countOfOnes[i] = binary.charAt(i) - '0';

            if (i > 0) {
                countOfOnes[i] += countOfOnes[i - 1];
            }
        }
    }

    public static boolean isSame(int i, int j) {
        int expectedCount = j - i + 1;
        int actualCount = countOfOnes[j];

        if (i > 0)
            actualCount -= countOfOnes[i - 1];

        return (expectedCount == actualCount) || (actualCount == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCase = 1;

        while (scanner.hasNext()) {
            prepare(scanner.next());
            int query = scanner.nextInt();
            stringBuilder.append(String.format("Case %d:%n", testCase++));

            while (query-- > 0) {
                int i = scanner.nextInt();
                int j = scanner.nextInt();

                stringBuilder.append(String.format("%s%n", isSame(Math.min(i, j), Math.max(i, j)) ? "Yes" : "No"));
            }
        }

        System.out.print(stringBuilder);
    }
}
