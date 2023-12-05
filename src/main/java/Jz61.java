import java.util.Arrays;

public class Jz61 {
}

class Solution61 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param numbers int整型一维数组
     * @return bool布尔型
     */
    public boolean IsContinuous(int[] numbers) {
        // write code here
        Arrays.sort(numbers);
        int zero = 0;
        int gap = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero++;
            } else if (i < numbers.length - 1) {
                if (numbers[i + 1] == numbers[i]) {
                    return false;
                } else {
                    gap += numbers[i + 1] - numbers[i] - 1;
                }
            }
        }
        return gap <= zero;
    }
}