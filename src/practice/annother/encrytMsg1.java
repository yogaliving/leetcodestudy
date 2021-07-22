package practice.annother;

public class encrytMsg1 {
    public static void main(String[] args) {
        int[] a = {4,3,2,1,0};
        System.out.println(encrytMsg("abcde", a, 2));
    }
    public static String encrytMsg(String msg,int key[],int count) {
        char[] chars = msg.toCharArray();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[j] = msg.charAt(key[j]);
            }
             msg = String.valueOf(chars);
        }
        return msg;
    }
}
