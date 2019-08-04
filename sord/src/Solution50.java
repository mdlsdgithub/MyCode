import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: ni.s
 * @date: 2019/08/04
 */
public class Solution50 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length==0){
            duplication[0]=-1;
            return false;
        }
        boolean flag=false;
        Map<Integer,Integer> hashMap=new HashMap();
        for(int i=0;i<numbers.length;i++){
            if(hashMap.containsKey(numbers[i])){
                hashMap.put(numbers[i],hashMap.get(numbers[i])+1);
            }else{
                hashMap.put(numbers[i],1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            if(entry.getValue()!=1){
                duplication[0]=entry.getKey();
                flag=true;
                break;

            }
        }
        return flag;
    }
}
