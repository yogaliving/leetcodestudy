package practice.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989
 */
public class addToArrayForm1 {
    public static void main(String[] args) {
        int[] a=  {1,2,0,0};
        addToArrayForm1(a,34);
    }
    //错的有问题，K比较大的话就不适用了
    public static List<Integer> addToArrayForm1(int[] A, int K) {
        int a = 0;
        int len = A.length;
        int[] B=new int[len+1];
        List<Integer> list = new ArrayList<>();
        while ((a<len-1))
        {
            A[len-1-a] = A[len-1-a] +K%10;
            K = K/10;
            if(A[len-1-a]>9) {
                A[len-2-a] +=1;
                A[len-1-a] -=10;
            }
            B[len-a] = A[len-1-a];
            a++;
        }

        if(A[0]>9) {
            A[0] -=10;
            B[1] = A[0];
            B[0] = 1;
        }else
            B[1]=A[0];
        for (int i =0;i<len+1;i++){
            if (i==0&&B[i]==0) continue;
            list.add(B[i]);
        }
        return list;
    }

    //官方答案
    public List<Integer> addToArrayForm3(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
