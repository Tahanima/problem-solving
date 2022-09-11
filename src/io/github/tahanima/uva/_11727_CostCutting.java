package io.github.tahanima.uva;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author tahanima
 */
public class _11727_CostCutting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = scanner.nextInt();
        int[] salary = new int[3];

        for (int i = 1; i <= testCases; i++) {
            for (int j = 0; j < 3; j++) {
                salary[j] = scanner.nextInt();
            }

            Arrays.sort(salary);
            stringBuilder.append("Case ")
                    .append(i)
                    .append(": ")
                    .append(salary[1])
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
