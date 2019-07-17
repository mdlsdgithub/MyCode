import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: ni.s
 * @date: 2019/07/17
 */
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
       ArrayList<Integer> arrayList=new ArrayList<>();
       if(root==null){
           return arrayList;
       }
       Queue<TreeNode> queue=new LinkedList<TreeNode>();
       queue.offer(root);
       while(!(queue.isEmpty())){
           root=queue.poll();
           if(root.left!=null){
               queue.offer(root.left);
           }
           if(root.right!=null){
               queue.offer(root.right);
           }
           arrayList.add(root.val);
       }
       return arrayList;
    }
}
