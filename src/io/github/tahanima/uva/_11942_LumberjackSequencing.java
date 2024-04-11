package io.github.tahanima.uva;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _11942_LumberjackSequencing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        System.out.println("Lumberjacks:");

        while (T-- > 0) {
            int n0 = scanner.nextInt();
            int n1 = scanner.nextInt();

            boolean isGreater = (n1 - n0) > 0;
            boolean isSame = (n1 - n0) == 0;
            boolean isOrdered = true;
                    
            for (int i = 1; i <= 8; i++) {
                int n = scanner.nextInt();
                
                if (isSame) {
                    isOrdered &= (n == n1);
                } else if (isGreater) {
                    isOrdered &= (n - n1) > 0;
                } else {
                    isOrdered &= (n - n1) < 0;
                }

                n1 = n;
            }

            System.out.printf("%s%n", isOrdered ? "Ordered" : "Unordered");
        }
    }
}
