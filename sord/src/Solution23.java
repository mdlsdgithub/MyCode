/**
 * @Author: ni.s
 * @date: 2019/07/22
 */
public class Solution23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==1){
            return true;
        }
        if(sequence.length==0){
            return false;
        }
        return ju(sequence,0,sequence.length-1);
    }
    public boolean ju(int[] a,int start,int root){
        if(start>=root){
            return true;
        }
        int i=root;
        while(i>start&&a[i-1]>a[root]){
            i--;
        }
        for(int j=start;j<i-1;j++){
            if(a[j]>a[root]){
                return false;
            }
        }
        return ju(a,start,i-1)&&ju(a,i,root-1);
    }
}
