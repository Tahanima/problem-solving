package io.github.tahanima.leetcode;

import java.util.Arrays;

/**
 * @author tahanima
 */
public class _435_NonOverlappingIntervals {
    public class Pair implements Comparable<Pair> {
        public int first;
        public int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            if (first == o.first) {
                if (second == o.second) {
                    return 0;
                } else {
                    return (second < o.second) ? -1 : 1;
                }
            } else {
                return (first < o.first) ? -1 : 1;
            }
        }
    }

    public boolean isOverlapping(int s0, int e0, int s1, int e1) {
        if (s0 <= s1 && e0 >= e1) {
            return true;
        } else if (s0 >= s1 && e0 <= e1) {
            return true;
        } else if (e0 >= s1 && e0 <= e1) {
            return true;
        } else return s0 >= s1 && s0 <= e1;
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Pair[] intervalPairs = new Pair[intervals.length];
        int i = 0;

        for (int[] interval : intervals) {
            intervalPairs[i++] = new Pair(interval[0], interval[1]);
        }

        Arrays.sort(intervalPairs);

        int discardCount = 0;
        int start = intervalPairs[0].first;
        int end = intervalPairs[0].second;

        i = 1;
        for (; i < intervals.length; i++) {
            if (isOverlapping(intervalPairs[i].first, intervalPairs[i].second, start, end) && end != intervalPairs[i].first) {
                discardCount++;

                if (intervalPairs[i].second < end) {
                    start = intervalPairs[i].first;
                    end = intervalPairs[i].second;
                }
            } else {
                start = intervalPairs[i].first;
                end = intervalPairs[i].second;
            }
        }

        return discardCount;
    }
}
