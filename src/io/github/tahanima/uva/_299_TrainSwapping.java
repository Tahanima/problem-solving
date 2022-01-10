package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/10/2022
 */
public class _299_TrainSwapping {
    final static int MAX = 51;
    final static int[] mark = new int[MAX];
    final static int[] order = new int[MAX];

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
            stringBuilder.append(String.format("Optimal train swapping takes %d swaps.\n", numberOfSwaps));
        }

        System.out.print(stringBuilder);
    }
}
