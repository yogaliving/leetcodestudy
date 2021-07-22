package practice.String1;

import java.util.Stack;
//碰到'('重新计算，利用栈保存之前的计算结果以及   sign的符号
public class calculate_224 {
    public static void main(String[] args) {
        System.out.println('0'+1);
    }
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            char c = chars[i];
            if (c ==' '){
                continue;
            }
            if (Character.isDigit(c)) {
                num = num * 10 + c-'0';
            }else if (c=='+'||c=='-'){
                res += sign * num;
                num = 0;
                sign = c== '+' ? 1 : -1;
            }else if(c=='('){
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }else if (c==')'){
                res += sign * num;
                num = 0;
                res *=stack.pop();
                res +=stack.pop();
            }
        }
        res +=sign*num;
        return res;
    }
}
