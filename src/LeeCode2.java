import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LeeCode2 {
    public static  void main(String[] args){
        LeeCode2 leeCode2 = new LeeCode2();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(8);
//        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(0);
//        listNode2.next = new ListNode(6);
//        listNode2.next.next = new ListNode(4);
        ListNode listNode= leeCode2.addTwoNumbers(listNode1,listNode2);
    }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode re=new ListNode(0);
            ListNode r1 = l1;
            ListNode r2 = l2;
            ListNode nre = re;
            int flag = 0;
            while(r1!=null || r2!=null || flag>0){
                int x = (r1!=null)?r1.val:0;
                int y = (r2!=null)?r2.val:0;
                int sum =x+y;
                nre.next = new ListNode((sum +flag)%10);
                flag = (sum +flag) /10;
                nre = nre.next;
                r1 = (r1!=null)?r1.next:null;
                r2 =(r2!=null)?r2.next:null;
            }
            return re.next;
        }
}
