
public class Jz52 {
    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int i = 0;
        int j = 0;
        ListNode ph1 = pHead1;
        ListNode ph2 = pHead2;
        for(i=0;ph1!=null;i++){
            ph1 = ph1.next;
        }
        for(j=0;ph2!=null;j++){
            ph2 = ph2.next;
        }
        int k = i - j;
        if(k>0){
            for(int m=0;m<k;m++){
                pHead1 = pHead1.next;
            }
        }
        else{
            for(int m=0;m<-k;m++){
                pHead2 = pHead2.next;
            }
        }
        while(pHead1!=null&&pHead2!=null){
            if(pHead1.equals(pHead2)){
                return pHead1;
            }
            else{
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return null;
    }
}