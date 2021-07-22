package practice.stack_queue;
/**
 * 20
 */

import java.util.HashMap;
import java.util.Stack;

public class isValid1 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len%2==1) return false;
        HashMap<Character,Character> hashMap = new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('{','}');
        hashMap.put('[',']');
        Stack<Character> stack = new Stack();
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if (hashMap.containsValue(s.charAt(i))){
                if (stack.isEmpty()||hashMap.get(stack.pop())!=s.charAt(i)) return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
