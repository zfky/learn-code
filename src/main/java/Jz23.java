public class Jz23 {
}
class Solution23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode low  = pHead;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if(fast == low){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        low = pHead;
        while(low!=fast){
            low=low.next;
            fast=fast.next;
        }
        return low;
    }
}
