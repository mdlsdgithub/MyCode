/**
 * @Author: ni.s
 * @date: 2019/07/12
 */
public class Solution06 {
    public static void main(String[] args) {

    }
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
       return findmin(array,0,array.length-1);

    }
    public int findmin(int[] array,int left,int right){
        int mid=left+(right-left)/2;
        if(right-left==1){
            return array[right];
        }
        if(array[mid]<array[left]){
            return findmin(array,left,mid);
        }else if(array[mid]==array[left]){
           return findmin(array,left,mid)<findmin(array,mid,right)?findmin(array,left,mid):findmin(array,mid,right);
        }else {
            return findmin(array,mid,right);
        }
    }
}
