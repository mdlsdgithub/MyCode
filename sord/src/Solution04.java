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
            return root;
        }
        int i;
        for(i=0;i<pre.length;i++){
            if(pre[0]==in[i]){
                break;
            }
        }
        if(i>0){
            int pref[]=new int[i];
            int inf[]=new int[i];
            for(int j=0;j<i;j++){
                pref[j]=pre[j+1];
                inf[j]=in[j];
            }
            root.left=reConstructBinaryTree(pref,inf);
        }else{
            root.left=null;
        }
        if(len-i-1>0){
            int prel[]=new int[len-1-i];
            int inl[]=new int[len-1-i];
            for(int j=0;j<len-1-i;j++){
                prel[j]=pre[j+1+i];
                inl[j]=in[j+1+i];
            }
            root.right=reConstructBinaryTree(prel,inl);
        }else{
            root.right=null;
        }
        return root;

    }

}
