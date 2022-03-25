package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 03/25/2022
 */
public class TravelFast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int bike = scanner.nextInt();
            int car = scanner.nextInt();

            if (bike < car) {
                System.out.println("BIKE");
            } else if (car < bike) {
                System.out.println("CAR");
            } else {
                System.out.println("SAME");
            }
        }
    }
}
