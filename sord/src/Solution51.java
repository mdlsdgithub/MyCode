/**
 * @Author: ni.s
 * @date: 2019/08/04
 */
public class Solution51 {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];

        for(int i=0;i<B.length;i++){
            B[i]=mult(i,A);
        }
        return B;
    }
    public static int mult(int p,int[] A){
        int value=1;
        for(int i=0;i<A.length;i++){
            if(i==p){
                continue;
            }
            value*=A[i];
        }
        return value;
    }
}
