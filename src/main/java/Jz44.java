public class Jz44 {
}

class Solution44 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param n int整型
     * @return int整型
     */
    public int findNthDigit (int n) {
        // write code here
        long sum = 9;
        int i = 1;
        long j = 1;
        while (n > sum) {
            n -= sum;
            i++;
            j *= 10;
            sum = 9 * i * j;
        }
        // n为超出当前数量级的位数，n-1为下标
        long val = j + (n - 1) / i; // 所处的真实数字
        int mod = (n - 1) % i; // 所处的真实数字中的位次
        return String.valueOf(val).charAt(mod) - '0';
    }
}