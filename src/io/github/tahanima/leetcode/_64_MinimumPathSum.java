package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _64_MinimumPathSum {
    int row = 0;
    int col = 0;
    int[][] _grid;
    int[][] dp = new int[205][205];
    int INF = 100000;

    public int solve(int r, int c) {
        if (r == (row - 1) && c == (col - 1)) {
            return _grid[r][c];
        } else if (r >= row || c >= col) {
            return INF;
        } else if (dp[r][c] < INF) {
            return dp[r][c];
        } else {
            return dp[r][c] = _grid[r][c] + Math.min(solve(r + 1, c), solve(r, c + 1));
        }
    }

    public int minPathSum(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        _grid = grid;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dp[i][j] = INF;
            }
        }

        return solve(0, 0);
    }
}
