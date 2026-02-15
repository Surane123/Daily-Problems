class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices. length == 0) return 0;
        int min = prices[0];
        int Profit = 0;
        for (int i = 1; i < prices. length; i++) {
            int Today = prices[i] - min;
            if (Today> Profit) {
                Profit = Today;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return Profit;
    }
}
