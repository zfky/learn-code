public class Jz66 {
}

class Solution66 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param A int整型一维数组
     * @return int整型一维数组
     */
    public int[] multiply (int[] A) {
        // write code here
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i-1] * A[i-1];
        }
        int tmp = 1;
        for(int i = A.length - 2; i >= 0; i--) {
            tmp = tmp * A[i+1];
            B[i] *= tmp;
        }
        return B;
    }
}