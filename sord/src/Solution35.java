/**
 * @Author: ni.s
 * @date: 2019/07/25
 */
public class Solution35 {
    public int InversePairs(int [] array) {
        int count=0;
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
        }
        return count%1000000007;
    }
}
