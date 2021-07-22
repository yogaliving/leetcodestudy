package practice.String1;

public class getNext1 {
    public static void main(String[] args) {
        char[] pattern = "ABABCABAA".toCharArray();
        char[] text = "ABABABCABAABABABAB".toCharArray();
        kmp_search(text,pattern);
    }

    //得到前缀表，重点注意是前缀表predix[i]加一的话需要保证前面一个元素是prefix[i]
    static void get_prefix(char[] pattern,int[] prefix){
        int len = 0;
        prefix[0]=0;
        int i =1;
        int n = pattern.length;
        while (i<n){
            if (pattern[len]==pattern[i]){
                len++;
                prefix[i] = len;
                i++;
            }else {
                if(len>0)
                len = prefix[len-1];
                else {
                    prefix[i] = 0;
                    i++;
                }
            }
        }
    }
    static void move_prefix(int[] prefix){
        for (int i = prefix.length-1; i > 0; i--) {
            prefix[i] = prefix[i-1];
        }
        prefix[0] = -1;
    }
    static void kmp_search(char[] text,char[] pattern){
        int len = pattern.length;
        int[] prefix = new int[len];
        get_prefix(pattern,prefix);
        move_prefix(prefix);
        int n = text.length; int i =0;//text的下标以及长度
        int m=pattern.length-1; int j =  0;//pattern的长度以及下标
        while (i<n){
            if (j==m){
                System.out.println(i-j);
                break;
            }
            if (pattern[j]==text[i]){
                i++;j++;
            }else {
                j=prefix[j];
                if (j==-1) {
                    i++;j++;
                }
            }
        }
    }
}
