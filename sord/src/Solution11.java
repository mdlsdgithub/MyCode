/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
public class Solution11 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
