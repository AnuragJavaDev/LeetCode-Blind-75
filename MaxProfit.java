//#121 Best Time to Buy and Sell Stock
public class MaxProfit
{

    public static void main(String[] args) {
   int prices[] = {7,1,5,3,6,4};
         //Output: 5
         System.out.println( maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
         // Store the first day's price as the minimum price
        int minPrice=prices[0];
        // Initially, maximum profit is 0
        int maxpro=0;
         // Traverse the array from the second day
        for(int i=1;i<prices.length;i++)
        {
              // If today's price is lower, update the minimum price
            if(minPrice>prices[i])
            {
                // Calculate profit by selling at today's price
                minPrice=prices[i];
            }
            else
            {
                int profit=prices[i] - minPrice;
                 // Update maximum profit if a better profit is found
                if(profit>maxpro)
                {
                    maxpro=profit;
                }
            }
        }

        // Return the maximum profit
  return maxpro;
    }
}