import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/26
 */
public class Solution41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        int plow=1;
        int phigh=2;
        while(phigh>plow){
            int cur=(phigh+plow)*(phigh-plow+1)/2;
            if(cur==sum){
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=plow;i<=phigh;i++){
                    list.add(i);
                }
                arrayLists.add(list);
                plow++;
            }else if(cur<sum){
                phigh++;
            }else{
                plow++;
            }
        }

        return arrayLists;
    }
}
