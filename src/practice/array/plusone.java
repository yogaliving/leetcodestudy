package practice.array;

public class plusone {


    public int[] plusone(int[] digits){
        int a = digits.length;
        int a1 =0; //储存原来的数组的值
        int count = 1;
        for(int i=a-1;i>=0;i--){
            a1=digits[i]*count+a1;
            count=count*10;
        }
        a1++;
        int a2 = (a1+"").length();
        int[] b = new int[a2];
        for (int i=a2-1;i>=0;i--){
            b[i] = a1/count%10;
            count=count*10;
        }
        return b;
    }
}
