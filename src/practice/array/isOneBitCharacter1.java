package practice.array;

/**
 * 717
 */
public class isOneBitCharacter1 {
    public static void main(String[] args) {
            int[] a = {0,1,0};
        System.out.println(isOneBitCharacter(a));
    }
    public static boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if(len==1) return true;
        if(len==2&&bits[0]==1) return false;
        int i =0; int lastnum = 0;
        while (i<len-1){
            if(bits[i]==0) {
                i++;
                lastnum=bits[i];
                continue;
            }
            if (bits[i]==1) {
                if (i+2>=len) break;
                i = i + 2;
                lastnum=bits[i];
                continue;
            }
        }
        if (lastnum==0)
        return true;
        else return false;
    }
}
