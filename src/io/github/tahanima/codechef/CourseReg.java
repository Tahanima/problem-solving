package io.github.tahanima.codechef;

import java.util.Scanner;

/*
 * @author tahanima
 */
public class CourseReg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            System.out.printf("%s%n", m - k >= n ? "Yes" : "No");
        }
    }
}
