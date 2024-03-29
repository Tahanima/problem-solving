package io.github.tahanima.uva;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class _713_AddingReversedNumbers {
    public static String reverse(String num) {
        return (new StringBuilder(num)).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            BigInteger a = new BigInteger(reverse(scanner.next()));
            BigInteger b = new BigInteger(reverse(scanner.next()));
            BigInteger sum = a.add(b);

            stringBuilder.append(String.format("%d%n", new BigInteger(reverse(sum.toString()))));
        }

        System.out.print(stringBuilder);
    }
}
