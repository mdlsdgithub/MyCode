import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: ni.s
 * @date: 2019/07/25
 */
public class Solution38 {
    public int TreeDepth(TreeNode root) {


        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int depth = 0, count = 0, nextCount = 1;
        while(queue.size()!=0){
            TreeNode top = queue.poll();
            count++;
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}
