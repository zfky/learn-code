import java.util.ArrayList;
import java.util.Stack;

public class Jz77 {
    public static void main(String[] args) {
        TreeNode pRoot = new TreeNode(1);
        TreeNode pRootL = new TreeNode(2);
        TreeNode pRootR = new TreeNode(3);
        TreeNode pRootLL = new TreeNode(4);
        TreeNode pRootLR = new TreeNode(5);
        pRoot.left = pRootL;
        pRoot.right = pRootR;
        pRootL.left = pRootLL;
        pRootL.right = pRootLR;
        Solution77 s77 = new Solution77();
        System.out.println(s77.Print(pRoot).toString());
    }
}

class Solution77 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        if(pRoot == null){
            return array;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while(!stack1.empty() || !stack2.empty()){
            ArrayList<Integer> arrayTmp1 = new ArrayList<>();
            ArrayList<Integer> arrayTmp2 = new ArrayList<>();
            while(!stack1.empty()){
                TreeNode pNode1 = stack1.pop();
                arrayTmp1.add(pNode1.val);
                if (pNode1.left != null) {
                    stack2.push(pNode1.left);
                }
                if(pNode1.right!=null){
                    stack2.push(pNode1.right);
                }
            }
            if(!arrayTmp1.isEmpty()){
                array.add(arrayTmp1);
            }
            while(!stack2.empty()){
                TreeNode pNode2 = stack2.pop();
                arrayTmp2.add(pNode2.val);
                if(pNode2.right!=null){
                    stack1.push(pNode2.right);
                }
                if (pNode2.left != null) {
                    stack1.push(pNode2.left);
                }
            }
            if(!arrayTmp2.isEmpty()){
                array.add(arrayTmp2);
            }
        }
       return array;
    }

}

