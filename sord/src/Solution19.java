import java.util.ArrayList;

/**
 * @Author: ni.s
 * @date: 2019/07/16
 */
public class Solution19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row=matrix.length;
        if(row==0){
            return null;
        }
        int col=matrix[0].length;
        if(col==0){
            return null;
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        int startRow=0;
        int endRow=row-1;
        int startCol=0;
        int endCol=col-1;
        while(startRow<=endRow&&startCol<=endCol){
            if(startRow==endRow){
                for(int i=startCol;i<=endCol;i++){
                    list.add(matrix[startRow][i]);

                }
                return list;
            }
            if(startCol==endCol){
                for(int i=startRow;i<=endRow;i++){
                    list.add(matrix[i][startCol]);
                }
                return list;
            }
            for(int i=startCol;i<=endCol;i++){
                list.add(matrix[startRow][i]);
            }
            for(int i=startRow+1;i<=endRow;i++){
                list.add(matrix[i][endCol]);
            }
            for(int i=endCol-1;i>=startCol;i--){
                list.add(matrix[endRow][i]);
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                list.add(matrix[i][startCol]);
            }
            startRow=startRow+1;
            endRow=endRow-1;
            startCol=startCol+1;
            endCol=endCol-1;
        }
        return list;
    }
}
