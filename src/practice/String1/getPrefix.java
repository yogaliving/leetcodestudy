package practice.String1;

public class getPrefix {
    public static void main(String[] args) {
        char[] pattern = "ABABCABAA".toCharArray();
        char[] text = "ABABABCABAA".toCharArray();
        kmp_search(text,pattern);
    }

    //把prefix往后移一位，把第一位设为-1
    static void move_prefix_table(int[] prefix){
        for (int i =prefix.length-1; i > 0; i--) {
            prefix[i] = prefix[i-1];
        }
        prefix[0]=-1;
    }
    //kmp算法
    static int kmp_search(char[] text,char[] pattern){
        int[] prefix = new int[pattern.length];
        prefix_table(pattern,prefix,prefix.length);
        move_prefix_table(prefix);
        //text[i] , m = length(text)
        //pattern[j] , n = length(pattern)
        int i = 0; int m =text.length;
        int j = 0; int n = pattern.length;
        int a =-1;
        while (i<m){
            if (j==n-1&&text[i]==pattern[j]){
                a=i-j;
                break;
            }
            if (text[i]==pattern[j]){
                ++i;++j;
            }
            else {
                j = prefix[j];
                if (j==-1){
                    ++i;++j;
                }
            }
        }
        return a;
    }

    //找到prefix前缀数组
    static void  prefix_table(char[] pattern,int prefix[], int n){
        prefix[0]=0;
        int len = 0;
        int i=1;
        while (i<n){
            if (pattern[i]==pattern[len]){
                len++;
                prefix[i] = len;
                i++;
            }else {
                if (len>0) len = prefix[len-1];
                else {
                    prefix[i] = 0;
                    i++;
                }
            }
        }
    }
}
