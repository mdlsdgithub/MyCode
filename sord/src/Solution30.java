/**
 * @Author: ni.s
 * @date: 2019/07/24
 */
public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++){
            max=Math.max(array[i]+max,array[i]);
            res=Math.max(res,max);
        }
        return res;
    }
}
