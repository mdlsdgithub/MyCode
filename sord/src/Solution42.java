import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/08/02
 */
public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> list=new ArrayList();
        int low=0;
        int high=array.length-1;
        while(high>low){
            if(array[low]+array[high]==sum){

                list.add(array[low]);
                list.add(array[high]);

            }else if(array[low]+array[high]<sum){
                low++;
            }else{
                high--;
            }
        }
        return list;


    }
}
