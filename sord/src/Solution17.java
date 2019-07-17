import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/16
 */
public class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val){
                result=doesTree1HaveTree2(root1,root2);
            }
            if(!result){
                result=HasSubtree(root1.left,root2);
            }
            if(!result){
                result=HasSubtree(root1.right,root2);
            }
        }

        return result;
    }


    public static boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
        //如果Tree2已经遍历完了都能对应的上，返回true
        if (node2 == null) {
            return true;
        }
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        if (node1 == null) {
            return false;
        }
        //如果其中有一个点没有对应上，返回false
        if (node1.val != node2.val) {
            return false;
        }

        //如果根节点对应的上，那么就分别去子节点里面匹配
        return doesTree1HaveTree2(node1.left,node2.left) && doesTree1HaveTree2(node1.right,node2.right);
    }

}
