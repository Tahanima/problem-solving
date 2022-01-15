package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/07/2022
 */
public class _10038_JollyJumpers {
    static final int MAX = 3005;
    static final boolean[] mark = new boolean[MAX];
    static final Scanner scanner = new Scanner(System.in);

    public static void clear() {
        for (int i = 0; i < MAX; i++) {
            mark[i] = false;
        }
    }

    public static void processInput(int n) {
        int previous = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            mark[Math.abs(current - previous)] = true;
            previous = current;
        }
    }

    public static boolean isJolly(int n) {
        for (int i = 1; i <= n - 1; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            processInput(n);

            stringBuilder.append(isJolly(n) ? "Jolly" : "Not jolly")
                    .append("\n");

            clear();
        }

        System.out.print(stringBuilder);
    }
}
