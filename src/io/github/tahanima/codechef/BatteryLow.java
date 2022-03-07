package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/07/2022
 */
public class BatteryLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int x = scanner.nextInt();
            System.out.printf("%s%n", x <= 15 ? "Yes" : "No");
        }
    }
}
