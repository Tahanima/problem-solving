package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11498_DivisionOfNlogonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int K = scanner.nextInt();

            if (K == 0)
                break;

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            while (K-- > 0) {
                int X = scanner.nextInt() - N;
                int Y = scanner.nextInt() - M;

                if (X == 0 || Y == 0) {
                    System.out.println("divisa");
                } else if (X > 0 && Y > 0) {
                    System.out.println("NE");
                } else if (X > 0 && Y < 0) {
                    System.out.println("SE");
                } else if (X < 0 && Y < 0) {
                    System.out.println("SO");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
