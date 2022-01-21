package io.github.tahanima.uva;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/21/2022
 */
public class _748_Exponentiation {
    public static String process(StringBuilder number) {
        while (number.charAt(0) == '0')
            number.deleteCharAt(0);

        int size = number.length() - 1;
        while (number.charAt(size) == '0')
            number.deleteCharAt(size--);

        return number.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            double R = scanner.nextDouble();
            int n = scanner.nextInt();

            BigDecimal answer = BigDecimal.valueOf(R);
            answer = answer.pow(n);

            stringBuilder.append(String.format("%s%n", process(new StringBuilder(answer.toPlainString()))));
        }

        System.out.print(stringBuilder);
    }
}
