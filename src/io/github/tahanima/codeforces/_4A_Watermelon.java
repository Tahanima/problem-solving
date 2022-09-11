package io.github.tahanima.codeforces;

import java.util.Scanner;

/**
 * @author tahanima
 */
public class _4A_Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte w = scanner.nextByte();

        System.out.printf("%s%n", w < 4 ? "NO" : ((w - 2) % 2 == 0 ? "YES" : "NO"));
    }
}
