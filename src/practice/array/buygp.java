package practice.array;

class buygp {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int a = prices.length;
        int max = 0;  //设置最大利润的变量
        for (int i=0;i<a-1;i++){
            for (int j=i+1;j<a;j++){
                if ((prices[j]-prices[i])<=0)
                break;
                if (max<prices[j]-prices[i])
                    max=prices[j]-prices[i];
            }
        }
        return max;
    }
}
