/**
 * @Author: ni.s
 * @date: 2019/08/03
 */
public class Solution47 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
