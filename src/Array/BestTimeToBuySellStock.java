package Array;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                profit = Math.max(profit, price - minPrice);
            }
        }
        return profit;
    }
}
