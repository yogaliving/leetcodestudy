package practice.stack_queue;

import java.util.Stack;

public class reverseParentheses1 {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("(u(love)i)"));
    }
    public static String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i]=='(') stack.push(i);
            if (arr[i]==')'){
                reverseString(arr,stack.pop()+1,i-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb1.append(arr[i]);
            if (arr[i]!='('&&arr[i]!=')')
                sb.append(arr[i]);
        }
        System.out.println(sb1.toString());
        return sb.toString();
    }

    private static void reverseString(char[] arr,int l,int r){
        while (l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
