public class Jz84 {
}
class Solution84 {
    int res = 0;
    public void dfs(TreeNode root, int sum){
        if(root != null){
            if(sum == root.val){
                res++;
            }
            dfs(root.left, sum - root.val);
            dfs(root.right, sum - root.val);
        }
    }
    public int FindPath (TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        else{
            dfs(root,sum);
            FindPath(root.left,sum);
            FindPath(root.right,sum);
        }
        return res;
    }
}
