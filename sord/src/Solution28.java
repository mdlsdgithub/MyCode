import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ni.s
 * @date: 2019/07/22
 */
public class Solution28 {
    public static void main(String[] args) {
        int[] array={1,2,3,2,2,2,5,4,2};
        int v=new Solution28().MoreThanHalfNum_Solution(array);
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i],1);
            }else {
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }
        }
        int count=(int)Math.floor((double) array.length/2);
        int num=0;
        for(Map.Entry<Integer,Integer> mm:hashMap.entrySet()){
            if(mm.getValue()>count){
               num=mm.getKey();
               break;
            }else{
                num=0;
            }
        }
        return num;
    }
}
