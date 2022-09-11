package io.github.tahanima.uva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @author tahanima
 */
public class _11461_SquareNumbers {
    static final int MAX = 100000;
    static ArrayList<Integer> squareNumbers = new ArrayList<>();

    public static void computeSquareNumbers() {
        int num = 1;

        while (num * num <= MAX) {
            squareNumbers.add(num * num);
            num++;
        }
    }

    public static int lowerBound(int n) {
        int index = Collections.binarySearch(squareNumbers, n);
        if (index < 0) {
            return Math.abs(index) - 1;
        }

        while (index > 0) {
            if (squareNumbers.get(index - 1) == n) {
                index--;
            } else {
                return index;
            }
        }

        return index;
    }

    public static int upperBound(int n) {
        int index = Collections.binarySearch(squareNumbers, n);
        if (index < 0) {
            return Math.abs(index) - 1;
        }

        int size = squareNumbers.size();
        while (index < size - 2) {
            if (squareNumbers.get(index + 1) == n) {
                index++;
            } else {
                return index + 1;
            }
        }

        return index + 1;
    }

    public static void main(String[] args) {
        computeSquareNumbers();
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a + b == 0) {
                break;
            }

            stringBuilder.append(String.format("%d%n", upperBound(b) - lowerBound(a)));
        }

        System.out.print(stringBuilder);
    }
}
