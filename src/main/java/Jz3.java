public class Jz3 {
}

class Solution3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        for (int i = numbers.length-1; i >= 0; i--) {
            if (numbers[i] != i) {
                if (numbers[numbers[i]] == numbers[i]) {
                    return numbers[i];
                } else {
                    swap(numbers, i, numbers[i]);
                    i++;
                }
            }
        }
        return -1;
    }
    public void swap(int[] numbers, int i, int j){
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }
}
