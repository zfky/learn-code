public class Jz68 {
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
class Solution68 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @param p int整型
     * @param q int整型
     * @return int整型
     */
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        // write code here
        if(root.val>Math.max(p,q)){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if (root.val<Math.min(p,q)){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root.val;
        }
    }

}