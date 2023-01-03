//import javax.swing.tree.TreeNode;

import java.lang.Math;

public class Jz55 {
}
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution555 {
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(1 + TreeDepth(root.left),1 + TreeDepth(root.right));
    }
}
