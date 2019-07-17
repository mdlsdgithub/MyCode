/**
 * @Author: ni.s
 * @date: 2019/07/16
 */
public class Solution18 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }else if(root.left==null){
            root.left=root.right;
            root.right=null;
        }else if(root.right==null){
            root.right=root.left;
            root.left=null;
        }else{
            TreeNode temp;
            temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        Mirror(root.left);
        Mirror(root.right);


    }
}
