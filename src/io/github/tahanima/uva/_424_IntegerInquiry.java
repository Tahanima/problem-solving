package io.github.tahanima.uva;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author tahanima
 */
public class _424_IntegerInquiry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger sum = BigInteger.ZERO;

        while (scanner.hasNext()) {
            BigInteger num = scanner.nextBigInteger();

            if (num.equals(BigInteger.ZERO))
                break;

            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
