/**
 * @Author: ni.s
 * @date: 2019/07/24
 */
public class Solution31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 1) {
            return 0;
        }
        int base = 1;
        int count = 0;
        int round = n;
        while (round > 0) {
            int weight = round % 10;

            round = round / 10;
            count+=round*base;
            if (weight == 1) {
                count += (n % base) + 1;
            } else if (weight > 1) {
                count += base;
            }
            base *= 10;
        }
        return count;
    }
}
