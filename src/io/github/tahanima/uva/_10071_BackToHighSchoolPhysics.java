package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _10071_BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            System.out.println(2 * v * t);
        }
    }
}
