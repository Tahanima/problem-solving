package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _299_TrainSwapping {
    static final int MAX = 51;
    static final int[] mark = new int[MAX];
    static final int[] order = new int[MAX];

    public static void clear(int n) {
        for (int i = 1; i <= n; i++) {
            mark[i] = 0;
        }
    }

    public static void add(int start, int end) {
        for (int i = start; i <= end; i++) {
            mark[i]++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int l = scanner.nextInt();
            for (int i = 0; i < l; i++) {
                order[i] = scanner.nextInt();
            }

            int numberOfSwaps = 0;
            for (int i = l - 1; i >= 0; i--) {
                numberOfSwaps += mark[order[i]];
                add(order[i] + 1, l);
            }

            clear(l);
            stringBuilder.append(String.format("Optimal train swapping takes %d swaps.%n", numberOfSwaps));
        }

        System.out.print(stringBuilder);
    }
}
