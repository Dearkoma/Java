package langqiao;

public class BuytoSellDynamic {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr, arr.length));
    }

    private static int maxProfit(int[] prices, int pricesSize) {
        if (pricesSize <= 1) return 0;
        int[] profits = new int[pricesSize + 1];//存所赚的
        profits[1] = 0;
        for (int k = 2; k <= pricesSize; k++) {
            int profit;
            int max = 0;
            profit = profits[k - 1];//把之前所赚暂存
            if (profit > max) {
                max = profit;
            }
            for (int i = 1; i <= k - 1; i++) {
                profit = profits[i] + prices[k - 1] - prices[i - 1];//之前所赚+当前所买-后几天卖
                if (profit > max) {//赚了就存
                    max = profit;
                }
            }
            profits[k] = max;//存入第k天买时能赚
        }
        return profits[pricesSize];//最后一天就是存放最大能赚利润
    }
}  
// public static int maxProfit(int[] prices, int pricesSize) {
    //     if (pricesSize <= 0)
    //         return 0;
    //     int profit = 0;
    //     int max = 0;
    //     profit = maxProfit(prices, pricesSize - 1);
    //     if (profit > max) {
    //         max = profit;
    // }
//     /*
//      *     public static int maxProfit(int[] prices, int pricesSize) {
//         if (pricesSize <= 0)
//             return 0;
//         int profit = 0;
//         int max = 0;
//         profit = maxProfit(prices, pricesSize - 1);
//         if (profit > max) {
//             max = profit;
//         }
//         for (int i = 1; i <= pricesSize - 1; i++) {
//             profit = maxProfit(prices, i) + prices[i] - prices[pricesSize - 1] - prices[i - 1];
//             if (profit > max) {
//                 profit = max;
//             }
//         }
//         return max;
//     }
// }
//      */
/*
 * public class BuytoSell {
   public static void main(String[] args) {
       int[] arr = {7, 1, 5, 3, 6, 4};
       System.out.println(maxProfit(arr, arr.length));
   }

   public static int maxProfit(int[] prices, int pricesSize) {
       if (pricesSize <= 1) {
           return 0;
       }
       int[] profits = new int[pricesSize - 1];
       for (int i = 0; i < pricesSize - 1; i++) {
           profits[i] = prices[i + 1] - prices[i];
       }
       int maxProfit = 0;
       for (int profit : profits) {
           if (profit > maxProfit) {
               maxProfit = profit;
           }
       }
       return maxProfit;
   }
}
 */