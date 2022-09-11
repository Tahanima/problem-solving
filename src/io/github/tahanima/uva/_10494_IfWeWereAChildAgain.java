package io.github.tahanima.uva;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author tahanima
 */
public class _10494_IfWeWereAChildAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            String num1 = scanner.next();
            char operator = scanner.next().charAt(0);
            int num2 = scanner.nextInt();

            if (operator == '/') {
               stringBuilder.append(String.format("%s%n", (new BigInteger(num1)).divide(BigInteger.valueOf(num2))));
            } else {
                stringBuilder.append(String.format("%s%n", (new BigInteger(num1)).mod(BigInteger.valueOf(num2))));
            }
        }

        System.out.print(stringBuilder);
    }
}
