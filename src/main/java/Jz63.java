public class Jz63{

}

class Solution63 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int get = 0;
        int minBuy = prices.length==0 ? 0 : prices[0];
        for(int i=0;i<prices.length;i++){
            minBuy = Math.min(minBuy,prices[i]);
            get = Math.max(get,prices[i]-minBuy);
        }
        return get;
    }
}