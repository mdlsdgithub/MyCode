/**
 * @Author: ni.s
 * @date: 2019/07/25
 */
public class Solution39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        return Math.abs(TreeDepth(root.left)-TreeDepth(root.right))<=1&&IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);

    }
    private static int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
}
