package practice.greedy;

import java.util.ArrayList;

public class wiggleMaxLength_376 {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len < 2) return len;
        int curDiff = 0; // 当前一对差值
        int preDiff = 0; // 前一对差值
        int result = 1;  // 记录峰值个数，序列默认序列最右边有一个峰值

        for (int i = 0; i < len - 1; i++) {
            curDiff = nums[i+1]-nums[i];
            if (curDiff*preDiff<0||preDiff==0){
                preDiff = curDiff;//这里是为了防止像[1,2,2,1,3,3,4,5]这种序列，导致preDiff为0，产生虚假的峰值
                result++;
            }
        }
        return result;
    }
}
