import java.util.LinkedList;

/**
 * @Author: ni.s
 * @date: 2019/08/03
 */
public class Solution46 {
    public int LastRemaining_Solution(int n, int m) {


        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i ++) {
            list.add(i);
        }

        int bt = 0;
        while (list.size() > 1) {
            bt = (bt + m - 1) % list.size();
            list.remove(bt);
        }

        return list.size() == 1 ? list.get(0) : -1;
    }
}
