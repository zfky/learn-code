public class Jz22 {
}

class Solution22 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode fast = pHead;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            pHead = pHead.next;
        }
        return pHead;
    }
}