package practice.greedy;

public class monotoneIncreasingDigits_738 {
    public int monotoneIncreasingDigits(int n) {
        char[] chars = (n+"").toCharArray();
        int index = 0;
        for (int i = chars.length-2; i >= 0; i--) {
            index = i+1;
            if (chars[i]>chars[i+1]){
                chars[i]-=1;
                while (index<chars.length) {
                    chars[index] = '9';
                    index++;
                }
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
