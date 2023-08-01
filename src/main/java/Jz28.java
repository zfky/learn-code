public class Jz28 {
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

class Solution28 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pRoot TreeNode类
     * @return bool布尔型
     */
    public boolean isSymmetrical (TreeNode pRoot) {
        // write code here
        if(pRoot == null)
            return true;
        return comp(pRoot.left,pRoot.right);
    }
    public Boolean comp(TreeNode l,TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r==null || l.val!=r.val){
            return false;
        }
        return(comp(l.left,r.right) && comp(l.right,r.left));
    }

}