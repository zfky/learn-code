public class Jz53 {
}
class Solution53 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @param k int整型
     * @return int整型
     */

    public int ef (int[] nums, double k) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] >= k) {
                right = mid - 1;
            } else if (nums[mid] < k) {
                left = mid + 1;
            }
        }
        return left;
    }
    public int GetNumberOfK (int[] nums, int k) {
        return ef(nums, k + 0.5) - ef(nums, k- 0.5);
        // write code here

    }

}
