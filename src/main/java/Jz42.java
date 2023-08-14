public class Jz42 {
}


class Solution42 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型
     */
    public int FindGreatestSumOfSubArray (int[] array) {
        // write code here
        // int dp[] = new int[array.length];
        // dp[0] = array[0];
        int maxsum = array[0];
        int preArray = array[0];
        for(int i=1;i<array.length;i++){
            preArray = Math.max(preArray+array[i],array[i]);
            maxsum = Math.max(maxsum,preArray);
        }
        return maxsum;
    }
}
