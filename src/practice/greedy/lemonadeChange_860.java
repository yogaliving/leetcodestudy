package practice.greedy;

public class lemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[3];//索引为0是5元的，索引为1是10元的，索引为2是20元的
        for (int i = 0; i < bills.length; i++) {
            if (bills[i]==5){
                money[0] +=1;
            }else if (bills[i]==10){
                if (money[0]==0) return false;
                else {
                    money[0] -=1;
                    money[1] +=1;
                }
            }
            else {
                if ((money[0]*5+money[1]*10)<15||money[0]==0) return false;
                else {
                    if (money[1]>0){
                        money[1] -=1;
                        money[0] -=1;
                    }else
                        money[0] -=3;
                }
            }
        }
        return true;
    }
}
