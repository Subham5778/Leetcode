import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] cost = new int[m][n];
        for (int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE);
        cost[0][0] = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0, 0}); // cost, x, y

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int c = curr[0], x = curr[1], y = curr[2];
            for (int i = 0; i < 4; i++) {
                int nx = x + directions[i][0], ny = y + directions[i][1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    int newCost = c + (grid[x][y] != i + 1 ? 1 : 0);
                    if (newCost < cost[nx][ny]) {
                        cost[nx][ny] = newCost;
                        if (grid[x][y] == i + 1) {
                            deque.offerFirst(new int[]{newCost, nx, ny});
                        } else {
                            deque.offerLast(new int[]{newCost, nx, ny});
                        }
                    }
                }
            }
        }

        return cost[m - 1][n - 1];
    }

  
}
