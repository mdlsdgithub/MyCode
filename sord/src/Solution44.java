import java.util.Stack;

/**
 * @Author: ni.s
 * @date: 2019/08/03
 */
public class Solution44 {
    public String ReverseSentence(String str) {
        Stack stack=new Stack();
        StringBuffer stringBuffer=new StringBuffer();
        int i=0;
        int indexFirst=0;
        while(i<str.length()){
            char d=str.charAt(i);
            String s=String.valueOf(d);
            if(" ".equals(s)){
                int indexLast=i;
                stack.push(str.substring(indexFirst,indexLast));
                indexFirst=i+1;
                i++;
            }else{
                i++;
            }
        }
        stack.push(str.substring(indexFirst));
        while(stack.size()!=0){
            stringBuffer.append(stack.pop());
            stringBuffer.append(" ");
        }
        String s=stringBuffer.toString();
        return s.substring(0,s.length()-1);
    }
}
