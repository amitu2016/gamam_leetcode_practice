package Day1;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int l = 0, r = 1;

        while(r < prices.length) {
          if (prices[l] < prices[r]){
              maxProfit = Math.max(maxProfit, (prices[r] - prices[l]));
          }else{
              l = r;
          }
            r++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,4,6};
        System.out.println(maxProfit(prices));
    }
}
