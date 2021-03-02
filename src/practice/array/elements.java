package practice.array;

public class elements {

    public static void main(String[] args) {
        System.out.println(4>(double)7/2);
        int[] a = new int[]{2,2,3,3,3,3,2};
        System.out.println(majorityElement2(a));
    }
    //leetcode - 169
    public static int majorityElement(int[] nums) {
        int count = 1;
        int b=0;
        int a = 0;
        for (int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j])
                    count++;
            }
            b=nums[i];
            if (count>nums.length/2){
                a=nums[i];
                break;
            }
            count=1;
        }
        return a;
    }

    public int majorityElement1(int[] nums) {
        int count = 1;
        int count1 = 1;
        int a = 0;
        for (int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j])
                    count++;
            }
            if ((count>nums.length/2&&nums.length%2==0)||count>(double)nums.length/2){
                a=nums[i];
                break;
            }
            else if(count>nums.length/2&&nums.length%2==1){
                a=nums[i];
                count1=count;
                if (nums[i]==a) {
                    count=1;
                    continue;
                }
                if (count>count1){
                    a=nums[i];
                    break;
                }
            }
            count=1;
        }
        return a;
    }

    public static int majorityElement2(int[] nums) {
        int count = 0;
        int maxn=nums[0];
        for (int i =1;i<nums.length;i++){
            if (nums[i]==maxn)
                count++;
            else
                count--;
            if (count<0){
                maxn=nums[i+1];
                //如果在前面的比较中count小于了0则证明maxn不在前半部分或者说它在前半部分不是最多的数！
            }
        }
        return maxn;
    }

}
