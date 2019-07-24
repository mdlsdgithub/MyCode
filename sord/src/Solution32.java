/**
 * @Author: ni.s
 * @date: 2019/07/24
 */
public class Solution32 {
    public static void main(String[] args) {

    }
    public String PrintMinNumber(int [] numbers) {
        String str="";
        int temp;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a=Integer.valueOf(numbers[i]+""+numbers[j]);
                int b=Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b){
                    temp=numbers[i];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            str+=String.valueOf(numbers[i]);
        }
        return str;
    }
}
