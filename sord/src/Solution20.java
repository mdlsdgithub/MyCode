/**
 * @Author: ni.s
 * @date: 2019/07/17
 */


import java.util.Stack;

public class Solution20 {
    //记得指定泛型，以免后续需要强制类型转换
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minNum=new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(minNum.isEmpty()) minNum.push(stack.peek()); //Java中获取栈顶:peek()
        else if(stack.peek()<minNum.peek()) minNum.push(stack.peek());
        else minNum.push(minNum.peek());
    }

    public void pop() {
        stack.pop();
        minNum.pop();//同步弹出元素
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return  minNum.peek();
    }
}