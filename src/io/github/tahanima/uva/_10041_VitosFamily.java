package io.github.tahanima.uva;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class _10041_VitosFamily {
    static final int MAX = 30005;
    static final int[] distance = new int[MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int noOfCases = scanner.nextInt();

        while (noOfCases-- > 0) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                distance[i] = scanner.nextInt();
            }

            Arrays.sort(distance, 0, n);

            int answer = 0;
            int avg = n / 2;

            for (int i = 0; i < n; i++) {
                answer += Math.abs(distance[i] - distance[avg]);
            }

            stringBuilder.append(String.format("%d%n", answer));
        }

        System.out.print(stringBuilder);
    }
}
