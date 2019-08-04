/**
 * @Author: ni.s
 * @date: 2019/08/04
 */
public class Solution49 {
    public static void main(String[] args) {
        new Solution49().StrToInt("1a33");
    }
    public int StrToInt(String str) {
        if("".equals(str)){
            return 0;
        }
        char[] charArrays=str.toCharArray();
        String first=String.valueOf(charArrays[0]);
        int base=1;
        int num=0;
        for(int i=0;i<charArrays.length;i++){
            if(charArrays[i]>='a'&&charArrays[i]<='z'||charArrays[i]>='A'&&charArrays[i]<='Z'){
                return 0;
            }
        }
        if("+".equals(first)){
            for(int i=charArrays.length-1;i>0;i--){
                num+=(charArrays[i]-48)*base;
                base*=10;
            }
            return num;
        }
        if("-".equals(first)){
            for(int i=charArrays.length-1;i>0;i--){
                num+=(charArrays[i]-48)*base;
                base*=10;
            }
            return 0-num;
        }
        for(int i=charArrays.length-1;i>=0;i--){
            num+=(charArrays[i]-48)*base;
            base*=10;
        }
        return num;
    }
}
