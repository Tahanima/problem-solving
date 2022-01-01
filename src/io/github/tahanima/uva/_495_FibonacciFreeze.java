package io.github.tahanima.uva;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/01/2022
 */
public class _495_FibonacciFreeze {
    final static int MAX = 5001;
    final static BigInteger fibonacci[] = new BigInteger[MAX];

    public static void computeFibonacci() {
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < MAX; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }
    }

    public static void main(String[] args) {
        computeFibonacci();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            stringBuilder.append("The Fibonacci number for " + num + " is " + fibonacci[num] + "\n");
        }

        System.out.print(stringBuilder.toString());
    }
}
