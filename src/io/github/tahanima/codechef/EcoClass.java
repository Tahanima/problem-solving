package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class EcoClass {
    static final int MAX = 105;
    static final int[] supply = new int[MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int answer = 0;

            for (int i = 0; i < n; i++) {
                supply[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (supply[i] == scanner.nextInt()) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
