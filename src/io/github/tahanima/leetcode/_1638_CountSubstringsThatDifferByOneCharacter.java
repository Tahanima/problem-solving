package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _1638_CountSubstringsThatDifferByOneCharacter {
    public int countSubstrings(String s, String t) {
        int sizeOfS = s.length();
        int sizeOfT = t.length();

        int[][] noOfMatchedCharsFromLeft = new int[sizeOfS][sizeOfT];
        int[][] noOfMatchedCharsFromRight = new int[sizeOfS][sizeOfT];

        for (int i = 0; i < sizeOfS; i++) {
            for (int j = 0; j < sizeOfT; j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    noOfMatchedCharsFromLeft[i][j] = 1;

                    if (i > 0 && j > 0) {
                        noOfMatchedCharsFromLeft[i][j] += noOfMatchedCharsFromLeft[i - 1][j - 1];
                    }
                }
            }
        }

        for (int i = sizeOfS - 1; i >= 0 ; i--) {
            for (int j = sizeOfT - 1; j >= 0; j--) {
                if(s.charAt(i) == t.charAt(j)) {
                    noOfMatchedCharsFromRight[i][j] = 1;

                    if (i < (sizeOfS - 1) && j < (sizeOfT - 1)) {
                        noOfMatchedCharsFromRight[i][j] += noOfMatchedCharsFromRight[i + 1][j + 1];
                    }
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < sizeOfS; i++) {
            for (int j = 0; j < sizeOfT; j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    int totalCombination = 1;

                    if (((i - 1) >= 0) && ((j - 1) >= 0) && noOfMatchedCharsFromLeft[i - 1][j - 1] > 0) {
                        totalCombination *= 1 + noOfMatchedCharsFromLeft[i - 1][j - 1];
                    }

                    if (((i + 1) < sizeOfS) && ((j + 1) < sizeOfT) && noOfMatchedCharsFromRight[i + 1][j + 1] > 0) {
                        totalCombination *= 1 + noOfMatchedCharsFromRight[i + 1][j + 1];
                    }

                    answer += totalCombination;
                }
            }
        }

        return answer;
    }
}
