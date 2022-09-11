package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class Credits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int x = scanner.nextInt();

            if (x > 65) {
                System.out.println("Overload");
            } else if (x < 35) {
                System.out.println("Underload");
            } else {
                System.out.println("Normal");
            }
        }
    }
}
