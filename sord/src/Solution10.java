/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
public class Solution10 {
    public int RectCover(int target) {


            if(target<=0){
                return 0;
            }else if(target<=2){
                return target;
            }else{
                return RectCover(target-1)+RectCover(target-2);
            }
        }
}
