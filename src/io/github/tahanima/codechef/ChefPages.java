package io.github.tahanima.codechef;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class ChefPages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 1 && b == 1) {
            System.out.println("https://discuss.codechef.com");
        } else if (a == 1) {
            System.out.println("https://www.codechef.com/contests");
        } else {
            System.out.println("https://www.codechef.com/practice");
        }
    }
}
