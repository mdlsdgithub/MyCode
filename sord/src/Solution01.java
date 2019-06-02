/**
 * @Author: ni.s
 * @date: 2019/05/29
 */
public class Solution01 {
    public static void main(String[] args) {
        int array[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Boolean is=new Solution01().Find(16,array);
        System.out.print(is);

    }
    public boolean Find(int target, int [][] array) {
        int j=array[0].length-1;
        int i=0;
        while(i<=array.length-1&&j>=0){
            System.out.print(array[i][j]);
            if(array[i][j]==target){
                return true;
            }else if(array[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return false;

    }
}
