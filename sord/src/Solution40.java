import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ni.s
 * @date: 2019/07/26
 */
public class Solution40 {
    public static void main(String[] args) {
        int[] num1=new int[1];
        int[] num2=new int[2];
        int[] array={2,4,3,6,3,2,5,5};
        FindNumsAppearOnce(array,num1,num2);
    }
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {


        List<String> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(!list.contains(String.valueOf(array[i]))){
                list.add(String.valueOf(array[i]));
            }else{
                list.remove(String.valueOf(array[i]));
            }
        }
        if(list.size()!=0){
            num1[0] = Integer.valueOf(list.get(0));
            num2[0] = Integer.valueOf(list.get(1));
        }
    }
}
