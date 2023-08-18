import java.util.*;
public class Jz85 {
}
class Solution85 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindGreatestSumOfSubArray (int[] array) {
        // write code here
        // dp[i]表示截止到i位置的最大和，dp[i] = max(array[i],dp[i-1]+array[i])  array[i] > dp[i-1]+array[i] , list.clear();list.add
//        int[] dp = new int[array.length];
        int maxPre= array[0];
        int max = array[0];
        int start = 0, end = 1;
        int startTmp = 0 , endTmp = 1;

        for(int i=1;i<array.length;i++){
            if(array[i] > maxPre+array[i]){ // 当前位置前和为负数
                startTmp = endTmp;
                maxPre = array[i];
            }else{ // 当前位置前和为正数
                maxPre = maxPre+array[i];
            }
            endTmp++;
            if(maxPre >= max){
                max = maxPre;
                start = startTmp;
                end = endTmp;
            }
        }
        // 赋值
        int[] array2 = new int[end-start];
        for(int i=start;i<end;i++){
            array2[i-start] = array[i];
        }
        return array2;
    }
}