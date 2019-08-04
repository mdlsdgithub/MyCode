import java.util.Arrays;

/**
 * @Author: ni.s
 * @date: 2019/08/03
 */
public class Solution45 {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length <= 4)
            return false;

        //先排序，否则计算间隔的时候可能会出现负值，比较麻烦
        Arrays.sort(numbers);
        int totalGap = 0;
        //计算大小王的数量
        int countZero = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                countZero++;
                continue;
            }
            //计算两数之间的间隔
            if(i < numbers.length - 1){
                int gap = numbers[i + 1] - numbers[i] - 1;
                //如果出现对子，如2 2，则gap为-1，直接返回false
                if(gap < 0)
                    return false;
                totalGap += gap;
            }
        }
        //所有数间隔大于王数量，就返回false
        if(totalGap > countZero){
            return false;
        }
        return true;
    }
}
