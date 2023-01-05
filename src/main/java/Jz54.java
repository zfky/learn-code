import java.util.*;

public class Jz54 {
    public static void main(String[] args) {
        TreeNode pRoot = new TreeNode(4);
        TreeNode pRootL = new TreeNode(2);
        TreeNode pRootR = new TreeNode(5);
        TreeNode pRootLL = new TreeNode(1);
        TreeNode pRootLR = new TreeNode(3);
        pRoot.left = pRootL;
        pRoot.right = pRootR;
        pRootL.left = pRootLL;
        pRootL.right = pRootLR;
        int k = 3;
        Solution54 s54 = new Solution54();
        System.out.println(s54.KthNode(pRoot,k));
    }

}

class Solution54 {
    public TreeNode res =null;
    int count = 0;
    public void f(TreeNode treeNode, int k){
        if(treeNode==null || count == k)
            return;
        f(treeNode.left,k);
        count++;
        if(count == k){
            res = treeNode;
        }
        f(treeNode.right,k);
    }
    public int KthNode (TreeNode proot, int k) {
        f(proot, k);
        if (k==0 || count<k) {
            return -1;
        } else {
            return res.val;
        }
    }
}