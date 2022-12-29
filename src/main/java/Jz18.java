public class Jz18 {
}

class Solution18 {
    public ListNode deleteNode (ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode pHead = head;
        ListNode pHead2 = head.next;
        if(head.val==val){
            return head.next;
        }
        while(pHead2!=null && pHead2.val!=val){
            pHead = pHead2;
            pHead2 = pHead2.next;
        }
        if(pHead2!=null){
            pHead.next = pHead2.next;
        }
        return head;
    }
}