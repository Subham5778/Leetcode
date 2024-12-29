class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int maxI = values[0] + 0; // Initialize with the first value and its index

        for (int j = 1; j < values.length; j++) {
            // Calculate the score for the pair (i, j)
            maxScore = Math.max(maxScore, maxI + values[j] - j);
            // Update maxI to be the maximum value of values[i] + i for the next iteration
            maxI = Math.max(maxI, values[j] + j);
        }

        return maxScore;
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values1 = {8, 1, 5, 2, 6};
        System.out.println(solution.maxScoreSightseeingPair(values1)); // Output: 11

        int[] values2 = {1, 2};
        System.out.println(solution.maxScoreSightseeingPair(values2)); // Output: 2
    }
}
