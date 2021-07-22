package practice.String1;

import java.util.ArrayList;
import java.util.Arrays;

public class replaceSpace1 {
    public String replaceSpace(String s) {
        char[] str = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>(str.length);
        for (int i = 0; i < str.length; i++) {
            if (str[i]!=' '){
                list.add(str[i]);
            }else {
                for (int j = 0; j < 3; j++) {
                    list.add("%20".charAt(j));
                }
            }
        }
        char[] c = new char[list.size()];
        for (int i = 0; i < c.length; i++) {
            c[i] = list.get(i);
        }
        return new String(c);
    }
}
