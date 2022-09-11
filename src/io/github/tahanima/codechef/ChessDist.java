package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class ChessDist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            System.out.println(Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)));
        }
    }
}
