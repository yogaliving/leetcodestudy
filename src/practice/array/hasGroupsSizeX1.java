package practice.array;

public class hasGroupsSizeX1 {
    public static void main(String[] args) {
        int [] a = {1,1,2,2,2,2};
        hasGroupsSizeX(a);
    }
    public static boolean hasGroupsSizeX(int[] deck) {
        int len = deck.length;
        boolean flag = true;
        if (len==1) return false;
        int count =1;int max = 0;
        for (int i=0;i<len-1;i++){
            if(deck[i]==deck[i+1]) count++;
            if (deck[i]!=deck[i+1]||i==len-2){
                if(count>max) max = count;
                count=1;
            }
        }
        count=1;max=max*100;
        for (int i=0;i<len-1;i++){
            if(deck[i]==deck[i+1]) count++;
            if (deck[i]!=deck[i+1]||i==len-2){
                max=max*count;
                if(max%count!=0) {
                    flag = false;
                    break;
                }
                count=1;
            }
        }
        return flag;
    }
}

