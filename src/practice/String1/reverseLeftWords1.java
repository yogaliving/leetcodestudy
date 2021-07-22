package practice.String1;

public class reverseLeftWords1 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder str = new StringBuilder();
        str.append(s,n-1,s.length());
        str.append(s,0,n);
        return str.toString();
    }
}
