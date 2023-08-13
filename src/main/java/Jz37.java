public class Jz37 {
}
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
class Solution37 {
    int index = 0;
    String S(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("#");
        }
        else{
            sb.append(root.val);
            sb.append("!");
            S(root.left,sb);
            S(root.right,sb);
        }
        return sb.toString();
    }
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        return S(root,sb);
    }
    TreeNode D(String str, TreeNode root){
        if(str.charAt(index) == '#'){
            root = null;
            index++;
        }else{
            int val = 0;
            while(str.charAt(index) != '!'){
                val = val*10 + (str.charAt(index) - '0');
                index++;
            }
            root = new TreeNode(val);
            index++;
            root.left = D(str,root.left);
            root.right = D(str,root.right);
        }
        return root;
    }
    TreeNode Deserialize(String str) {
        TreeNode root = null;
        return D(str,root);
    }
}