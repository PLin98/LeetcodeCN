//假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。
//设计一个算法来找到最大的利润。你可以完成尽可能多的交易（多次买卖股票）。然而，你不能同时参与多个交易（你必须在再次购买前出售股票）。
package zone.lin.leetcodeCN.Y2018.M04.D06;
class Solution {
    public int maxProfit(int[] prices) {
    	int i,max=0;
        for(i=1;i<=prices.length-1;i++)
        {
                if(prices[i]>prices[i-1]) 
                        max+=prices[i]-prices[i-1];
        }
        return max;
    }
}