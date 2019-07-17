import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
class ListNode14 {
    int val;
    ListNode14 next = null;

    ListNode14(int val) {
        this.val = val;
    }
}
public class Solution14 {
    public static void main(String[] args) {
        ListNode14 a=new ListNode14(1);
        ListNode14 b=new ListNode14(2);
        ListNode14 c=new ListNode14(3);
        a.next=b;
        b.next=c;
        ListNode14 listNode14=new Solution14().FindKthToTail(a,3);
        System.out.print(listNode14.val);

    }
    public ListNode14 FindKthToTail(ListNode14 head,int k) {
        if(head==null||k<=0) {
            return null;
        }
            ListNode14 first=head;
            ListNode14 last=head;
            for(int i=1;i<k;i++){
                if(first.next!=null){
                    first=first.next;
                }else{
                    return  null;
                }
            }
            while(first.next!=null){
                first=first.next;
                last=last.next;
            }
            return last;
        }
    }

