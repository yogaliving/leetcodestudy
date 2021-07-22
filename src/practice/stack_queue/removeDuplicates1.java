package practice.stack_queue;
/**
 * 1047
 */

import java.util.Stack;

public class removeDuplicates1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }
    private static String removeDuplicates(String S) {
        char[] arr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.size()==0){
                stack.push(arr[i]);
                continue;
            }
            if (stack.peek()!=arr[i])
                stack.push(arr[i]);
            else
                stack.pop();
        }

        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
