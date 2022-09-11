package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class _10424_LoveCalculator {
    public static int convert(String name) {
        int ans = 0;

        for (char ch : name.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                ans += ch - 'a' + 1;
            }
        }

        return ans;
    }

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

        while (scanner.hasNextLine()) {
            int first = getSum(convert(scanner.nextLine()));
            int second = getSum(convert(scanner.nextLine()));

            stringBuilder.append(String.format("%.2f %%%n", 100.0 * Math.min(first, second) / Math.max(first, second)));
        }

        System.out.print(stringBuilder);
    }
}
