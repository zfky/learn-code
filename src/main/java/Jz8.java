public class Jz8 {
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
class Solution8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode != null && pNode.right != null){
            TreeLinkNode rNode = pNode.right;
            while(rNode.left != null){
                rNode = rNode.left;
            }
            return rNode;
        }
        if(pNode != null && pNode.next != null){
            TreeLinkNode ppNode = pNode.next;
            if(ppNode.left == pNode){
                return ppNode;
            }
            else{
                while(ppNode.next != null && ppNode.next.right == ppNode){
                    ppNode = ppNode.next;
                }
                return  ppNode.next;
            }
        }
        return null;
    }
}

