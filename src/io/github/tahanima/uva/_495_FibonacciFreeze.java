package io.github.tahanima.uva;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author tahanima
 */
public class _495_FibonacciFreeze {
    static final int MAX = 5001;
    static final BigInteger[] fibonacci = new BigInteger[MAX];

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
            stringBuilder.append(String.format("The Fibonacci number for %d is %d%n", num, fibonacci[num]));
        }

        System.out.print(stringBuilder);
    }
}
