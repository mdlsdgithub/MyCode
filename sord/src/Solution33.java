import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/24
 */
public class Solution33 {
    public int GetUglyNumber_Solution(int index) {
        if(index<0){
            return 0;
        }
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        int m2=0;
        int m3=0;
        int m5=0;
        while(arrayList.size()<index){
            int num2=arrayList.get(m2)*2;
            int num3=arrayList.get(m3)*3;
            int num5=arrayList.get(m5)*5;
            int count=Math.min(num2,Math.min(num3,num5));
            arrayList.add(count);
            if(count==num2){
                m2++;
            }
            if(count==m3){
                m3++;
            }
            if(count==m5){
                m5++;
            }
        }

        return arrayList.get(arrayList.size()-1);
    }
}
