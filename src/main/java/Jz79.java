import java.util.*;
public class Jz79 {
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
class Solution79 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pRoot TreeNode类
     * @return bool布尔型
     */
    public boolean IsBalanced_Solution (TreeNode pRoot) {
        // write code here
        if(pRoot == null){
            return true;
        }
        int j = depTree(pRoot.left,0)-depTree(pRoot.right,0);
        return (Math.abs(j) <= 1)&&IsBalanced_Solution(pRoot.left)&&IsBalanced_Solution(pRoot.right);
    }
    public int depTree (TreeNode pRoot,int i){
        if(pRoot == null)
            return i;
        i++;
        return Math.max(depTree(pRoot.left,i),depTree(pRoot.right,i));
    }
}
