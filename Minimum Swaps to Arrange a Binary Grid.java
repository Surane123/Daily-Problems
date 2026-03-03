class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] values = new int[n];
        for (int i = 0; i < n; i ++){
            int val = 0;
            for (int j = n-1; j > 0; j--){
                if (grid[i][j] == 1) {
                    val = j;
                    break;
                }
            }
            values[i] = val;
        }
        int steps = 0;
        for (int i = 0; i < n; i++) {
            int j = i+1;
            while (i < values[i]) {
                if (j == n) return -1;
                values[i] += values[j];
                values[j] = values[i] - values[j];
                values[i] -= values[j];
                j++;
                steps++;
            }
        }
        return steps;
    }
}
