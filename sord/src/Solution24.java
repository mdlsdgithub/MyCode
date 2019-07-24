import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/22
 */
public class Solution24 {
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null){
            return res;
        }
        find(root,target);
        return res;
    }
    public void find(TreeNode root,int target){
        path.add(root.val);
        if(root.val==target&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(path));
        }
        if(root.left!=null){
            find(root.left,target-root.val);
        }
        if(root.right!=null){
            find(root.right,target-root.val);
        }
        path.remove(path.size()-1);

    }
}
