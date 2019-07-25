import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ni.s
 * @date: 2019/07/24
 */
public class Solution34 {
    public static void main(String[] args) {
        int d=new Solution34().FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp");
        System.out.print(d);
    }
    public int FirstNotRepeatingChar(String str) {
        if("".equals(str)){
            return -1;
        }
        HashMap<String,Integer> hashMap=new HashMap();
        String str1=str;
        while(str1.length()!=0){
            String letter=str1.substring(0,1);
            str1=str1.substring(1);
            if(!hashMap.containsKey(letter)){
                hashMap.put(letter,1);
            }else{
                hashMap.put(letter,hashMap.get(letter)+1);
            }
        }
        int index=0;
        char[] chararray=str.toCharArray();
       /*Set<Map.Entry<String,Integer>> entries=hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> it2 = entries.iterator();
        while(it2.hasNext()){
            Map.Entry<String, Integer> me = it2.next();

            int v=me.getValue();
            if(v==1){
                index=str.indexOf(me.getKey());

            }
        }*/
         for(int i=0;i<chararray.length;i++){
             String s =String.valueOf(chararray[i]);
             //System.out.println(hashMap.get(s));
             if(hashMap.get(s)==1){
                 index=str.indexOf(chararray[i]);
                 break;
             }
         }
        return index;
    }
}
