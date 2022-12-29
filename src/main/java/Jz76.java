public class Jz76 {
}
class Solution76 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        if (pHead.next.val == pHead.val) {
            ListNode p = pHead.next;
            while (p != null && p.val == pHead.val) {
                p = p.next;
            }
            return deleteDuplication(p);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
