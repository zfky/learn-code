import java.util.*;
public class Jz82 {
}


/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

class Solution82 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     * {0,2,8,-2}  0
     */
//    int i = 0;
//    public boolean hasPathSum (TreeNode root, int sum) {
//        // write code here
//        if(root == null ) {
//            return sum == 0 && i!=0;
//        }
//        i++;
//        return (hasPathSum(root.left, sum - root.val)&&(root.right == null))||
//               (hasPathSum(root.right, sum - root.val)&&(root.left == null));
//    }
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if(root == null ) {
            return false;
        }
        if(root.left==null && root.right==null && root.val==sum) {
            return true;
        }
        return  hasPathSum(root.left, sum - root.val)||
                hasPathSum(root.right, sum - root.val);
    }
}