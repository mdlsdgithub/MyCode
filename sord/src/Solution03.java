import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/05/29
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution03 {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        a.next=b;
        b.next=c;
        ArrayList<Integer> arrayList=new Solution03().printListFromTailToHead(a);
        System.out.print(arrayList);
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ListNode pre=null;
        ListNode node;
        if (listNode==null){
            return new ArrayList<>();
        }
        while(listNode!=null){
             node=listNode.next;
             listNode.next=pre;
             pre=listNode;
             listNode=node;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(pre!=null){
            arrayList.add(pre.val);
            pre=pre.next;
        }
        return arrayList;


    }


}
