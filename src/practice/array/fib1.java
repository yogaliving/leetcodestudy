package practice.array;

import java.util.HashMap;

/**
 * 509 尽量避免重复计算
 */
public class fib1 {
    HashMap hashMap = new HashMap();
    int a =0;int b =0;
    public int fib(int N) {
        if (N==0) return 0;
        if (N==1) return 1;
        if (hashMap.get(N-1)!=null) {
            if (hashMap.get(N-2)!=null) {
                return (int) hashMap.get(N - 1) + (int) hashMap.get(N - 2);
            }
            return (int) hashMap.get(N - 1) + fib(N - 2);
        }
        hashMap.put(N,fib(N - 1) + fib(N - 2));
        return fib(N - 1) + fib(N - 2);
    }
}
