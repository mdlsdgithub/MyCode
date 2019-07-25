/**
 * @Author: ni.s
 * @date: 2019/07/25
 */
public class Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        int length1=0;
        int length2=0;
        ListNode curr1=pHead1;
        ListNode curr2=pHead2;
        while(curr1!=null){
            length1++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            length2++;
            curr2=curr2.next;
        }
        // length1=getLength(pHead1);
        // length2=getLength(pHead2);
        if(length1>=length2){
            for(int i=length1-length2;i>0;i--){
                pHead1=pHead1.next;
            }

        }else{
            for(int i=length2-length1;i>0;i--){
                pHead2=pHead2.next;
            }
        }
        while(pHead1!=pHead2){
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return pHead1;
    }


    public static int getLength(ListNode pHead) {
        int length = 0;

        ListNode current = pHead;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
