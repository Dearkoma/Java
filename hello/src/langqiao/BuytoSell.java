package langqiao;

public class BuytoSell {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr, arr.length));
    }

    private static int maxProfit(int[] prices,int numSize) {
        int total = 0;
        for (int i = 0; i + 1 < numSize; i++) {
            if (prices[i] < prices[i + 1])
                total += prices[i + 1] - prices[i];
        }
        return total;
    }
}
