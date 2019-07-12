/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
public class Solution07 {
    public static void main(String[] args) {

    }
    public int Fibonacci(int n) {


        int preNum=1;
        int prePreNum=0;
        int result=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
            result=preNum+prePreNum;
            prePreNum=preNum;
            preNum=result;
        }
        return result;

    }

}
