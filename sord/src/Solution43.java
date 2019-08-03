/**
 * @Author: ni.s
 * @date: 2019/08/03
 */
public class Solution43 {
    public String LeftRotateString(String str,int n) {
        if("".equals(str)){
            return "";
        }
        StringBuffer stringBuffer=new StringBuffer(str);
        String string1=stringBuffer.substring(0,n);
        stringBuffer.replace(0,n,"");
        stringBuffer.append(string1);
        String String2=stringBuffer.toString();
        return String2;
    }
}
