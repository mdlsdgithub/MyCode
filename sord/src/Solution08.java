/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
public class Solution08 {
    public static void main(String[] args) {

    }
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
