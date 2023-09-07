public class Jz65 {
}
class Solution65 {
    public int Add(int num1,int num2) {
        int sum = num1;
        int add = num2;
        int tmp;
        while (add != 0) {
            tmp = sum;
            sum = sum ^ add;
            add = (tmp & add) << 1;
        }
        return sum;
    }
}
