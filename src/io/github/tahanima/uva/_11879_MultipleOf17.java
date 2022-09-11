package io.github.tahanima.uva;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11879_MultipleOf17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            BigInteger num = scanner.nextBigInteger();

            if (num.equals(BigInteger.ZERO))
                break;

            stringBuilder.append(String.format("%d%n", num.mod(BigInteger.valueOf(17)).equals(BigInteger.ZERO) ? 1 : 0));
        }

        System.out.print(stringBuilder);
    }
}
