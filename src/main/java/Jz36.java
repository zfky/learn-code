public class Jz36 {
}
class Solution36 {
    TreeNode pre = null;
    TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        Convert(pRootOfTree.left);
        if(pre == null){
            pre = pRootOfTree;
            head = pRootOfTree;
        }
        else{
            pre.right = pRootOfTree;
            pRootOfTree.left = pre;
            pre = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return head;
    }
}
