import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: ni.s
 * @date: 2019/07/23
 */
public class Solution29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(k>input.length){
            return arrayList;
        }else{
            for(int i=0;i<k;i++){
                arrayList.add(input[i]);
            }
            return  arrayList;
        }

    }
}
