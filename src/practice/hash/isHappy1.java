package practice.hash;
/**
 * 202 1 用hashset检测循环，即是否有相同的元素
 * 2 用快慢指针，参考循环链表，如果相遇的时候不是1则不快乐！
 */

import java.util.HashSet;

public class isHappy1 {
    private int getNextint(int n){
        int sum = 0;
        while (n%10!=0){
            sum += (n%10)^2;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        while (!set.contains(n)){
            set.add(n);
            n = getNextint(n);
            if (n==1) return true;
        }
        return false;
    }
    public boolean isHappy2(int n) {
        int slowRunner = n;
        int fastRunner = getNextint(n);
        while (slowRunner!=fastRunner){
            slowRunner = getNextint(n);
            fastRunner = getNextint(getNextint(n));
        }
        return fastRunner==1;
    }
}
