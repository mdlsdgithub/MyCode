import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
public class Solution13 {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1){
                arrayList1.add(array[i]);
            }else{
                arrayList2.add(array[i]);
            }
        }
        for (int i:arrayList2) {
            arrayList1.add(i);
        }
        for(int i=0;i<array.length;i++){
            array[i]=arrayList1.get(0);
            arrayList1.remove(0);
        }
    }
}
