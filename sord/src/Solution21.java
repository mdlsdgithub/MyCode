import java.util.Stack;

/**
 * @Author: ni.s
 * @date: 2019/07/17
 */
public class Solution21 {
    public static void main(String[] args) {
        int[] pushA={1,2,3,4,5};
        int[] popA={4,3,5,1,2};
        Boolean flag=new Solution21().IsPopOrder(pushA,popA);
        System.out.print(flag);
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        for(int i=popA.length-1;i>=0;i--){
            stack2.push(popA[i]);
        }
        if(stack1.isEmpty()){
            stack1.push(pushA[0]);
        }
        int j=1;
        while (j <= pushA.length && !(stack1.isEmpty())) {
            if(stack2.peek()!=stack1.peek()){
                if(j==pushA.length){
                    j++;
                    continue;
                }
                stack1.push(pushA[j]);
                j++;
            }else{


                stack2.pop();
                stack1.pop();

            }
        }


        return stack2.isEmpty();
    }
}
