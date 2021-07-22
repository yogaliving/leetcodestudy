package practice.String1;

public class reverseStr1 {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int count =0;
        while (count<k){
            char s1;
            int l=count; int r=Math.min(count+k-1,a.length);
            while (l<r) {
                if (r<a.length) {
                    s1 = a[l];
                    a[l] = a[r];
                    a[r] = s1;
                    l++;
                    r--;
                }
            }
            count+=2*k;
        }
        return new String(a);
    }
}
