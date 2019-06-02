import java.util.Arrays;

/**
 * @Author: ni.s
 * @date: 2019/06/02
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Solution04 {
    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        new Solution04().reConstructBinaryTree(pre,in);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=new TreeNode(pre[0]);
        int len=pre.length;
        if(len==1){
            root.left=null;
            root.right=null;
            return root;
        }
        int rootval=root.val;
        int i;
        for(i=0;i<len;i++){
            if(rootval==in[i]){
                break;
            }
        }

        if(i>0){
            int[] pr=new int[i];
            int[] ino=new int[i];
            for(int j=0;j<i;j++){
                pr[j]=pre[j+1];
                ino[j]=in[j];
            }
            root.left=reConstructBinaryTree(pr,ino);
        }else{
            root.left=null;
        }
        if(len-1-i>0){
            int[] pr=new int[len-1-i];
            int[] ino=new int[len-1-i];
            for(int j=0;j<len-1-i;j++){
                pr[j]=pre[j+i+1];
                ino[j]=in[j+i+1];
            }
            root.right=reConstructBinaryTree(pr,ino);
        }else {
            root.right=null;
        }
        return root;

    }

}
