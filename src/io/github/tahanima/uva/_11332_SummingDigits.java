package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11332_SummingDigits {
    public static int getSum(int n) {
        if (n < 10) {
            return n;
        } else {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            return getSum(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0)
                break;

            stringBuilder.append(getSum(n))
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
