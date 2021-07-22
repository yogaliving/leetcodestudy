package practice.String1;

public class repeatedSubstringPattern1 {
    public boolean repeatedSubstringPattern(String s) {
        String str= s+s;
        int len = s.length();
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i,len).equals(s))
                return true;
        }
        return str.substring(len/2,3*len/2).equals(s);
    }
}
