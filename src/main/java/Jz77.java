import java.util.ArrayList;
import java.util.Stack;

public class Jz77 {
}

class Solution77 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        ArrayList<Integer> arraytmp = new ArrayList<>();
        if(pRoot == null){
            return array;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while(!stack1.empty() && !stack2.empty()){
            while(!stack1.empty()){
                TreeNode pNode1 = stack1.pop();
                arraytmp.add(pNode1.val);
                if(pNode1.right!=null){
                    stack2.push(pNode1.right);
                }
                if (pNode1.left != null) {
                    stack2.push(pNode1.left);
                }
            }
            array.add(arraytmp);
            arraytmp.clear();
            while(!stack2.empty()){
                TreeNode pNode2 = stack2.pop();
                arraytmp.add(pNode2.val);
                if (pNode2.left != null) {
                    stack2.push(pNode2.left);
                }
                if(pNode2.right!=null){
                    stack2.push(pNode2.right);
                }
            }
            array.add(arraytmp);
            arraytmp.clear();
        }
       return array;
    }

}

