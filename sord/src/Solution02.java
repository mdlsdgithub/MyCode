import java.util.List;

/**
 * @Author: ni.s
 * @date: 2019/05/29
 */
public class Solution02 {
    public static void main(String[] args) {
        String yy=new Solution02().replaceSpace(new StringBuffer("hello world"));
        System.out.printf("yy");
    }
    public String replaceSpace(StringBuffer str) {
        int index=0;
        index=str.indexOf(" ");
        while(index!=-1){

            System.out.print(index);
            str.replace(index,index+1,"%20");
            System.out.print(str);
            index=str.indexOf(" ");
        }


        return str.toString();
    }
}
