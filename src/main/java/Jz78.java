import java.util.ArrayList;

public class Jz78 {
}
class Solution78 {
    ArrayList<ArrayList<Integer>> aArrayList = new ArrayList<>();
    public void f(TreeNode pRoot,int height){
        if(pRoot != null){
            if(aArrayList.size()<height){
                aArrayList.add(new ArrayList<>());
            }
            aArrayList.get(height-1).add(pRoot.val);
            f(pRoot.left,height+1);
            f(pRoot.right,height+1);
        }
    }
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        f(pRoot,1);
        return aArrayList;
    }
}
