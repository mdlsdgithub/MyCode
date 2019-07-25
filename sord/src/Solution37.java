/**
 * @Author: ni.s
 * @date: 2019/07/25
 */
public class Solution37 {
    public int GetNumberOfK(int [] array , int k) {
        int number=0;
        if(array!=null&&array.length>0){
            int first=getFirstK(array,k,0,array.length-1);
            int last=getLastK(array,k,0,array.length-1);
            if(first>-1&&last>-1){
                number=last-first+1;
            }
        }
        return number;
    }
    private int getFirstK(int[] array,int k,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)>>1;
        if(array[mid]>k){
            return getFirstK(array,k,start,mid-1);
        }else if(array[mid]<k){
            return getFirstK(array,k,mid+1,end);
        }else if(mid-1>=0&&array[mid-1]==k){
            return getFirstK(array,k,start,mid-1);
        }else{
            return mid;
        }
    }
    private int getLastK(int [] array,int k,int start,int end){
        int length=array.length;
        int mid=(start+end)>>1;
        while(start<=end){
            if(array[mid]>k){
                end=mid-1;
            }else if(array[mid]<k){
                start=mid+1;
            }else if(mid+1<length&&array[mid+1]==k){
                start=mid+1;
            }else{
                return mid;
            }
            mid=(start+end)>>1;
        }
        return -1;
    }
}
