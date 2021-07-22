package practice.String1;

/**
 * 151
 */
public class reverseWords1 {
    public String reverseWords(String s) {
        String s1 = s.trim();
        String[] str = new String[s1.length()];
        int size=0;
        String sString="";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=' '){
                sString+=s1.charAt(i);
            }else {
                str[size++] = sString;
                sString="";
            }
            if(i==s1.length()-1) str[size++] = sString;
        }
        String str2 ="";
        for (int i = size-1; i >=0; i--) {
            str2 = str2 + str[i]+" ";
        }
        return str2.trim();
    }
    public String reverseWords3(String s) {
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }
}
