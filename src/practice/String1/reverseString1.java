package practice.String1;

public class reverseString1 {
    public void reverseString(char[] s) {
        int l=0;int r=s.length-1;
        char s1;
        while (l<r){
            s1=s[l];
            s[l] = s[r];
            s[r] = s1;
            l++;
            r--;
        }
    }
}
