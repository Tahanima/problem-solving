package io.github.tahanima.uva;

import java.util.Scanner;

/*
 * @author tahanima
 * @since 01/13/2022
 */
public class _10327_FlipSort {
    final static int MAX = 1005;
    final static int[] nums = new int[MAX];

    public static int getMinimumExchange(int n) {
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            stringBuilder.append(String.format("Minimum exchange operations : %d\n", getMinimumExchange(n)));
        }

        System.out.print(stringBuilder);
    }
}
