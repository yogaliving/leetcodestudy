package practice.array;

import java.util.*;
/*
总结如下：

1、==比较的是对象引用是否相同，如果相同则是true，否则是false.对于字符串，如果不是通过new来创建的，
那字符串都会常量池中检查是否已经有该字符串，如果有，则直接指向该字符串，如果没有再在常量池中创建，
对于new出来的字符串，或者其他对象执行==的时候都是false;

2、equals用来比较的是两个对象的内容是否相等，由于所有的类都是继承自java.lang.Object类的，
所以适用于所有对象，如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，
而Object中的equals方法返回的却是==的判断，如果一个类不对equals重写，那么等价于判断==是true还是false.
*/
//leetcode 219
public class SameElement2 {
    public static void main(String[] args) {
        int[] q = new int[]{2147483647,-2147483648,2147483647,-2147483648};
        System.out.println(new SameElement2().containsNearbyDuplicate(q,2));

    }

    HashSet<Integer> hashSet = new HashSet<>();//得到所有含有重复数的值
    int a1 = 0;//记录重复元素的值是多少
    List<Integer> list =  new ArrayList<>();//获取重复元素的索引
    List<Integer> list1 =  new ArrayList<>();//获取重复元素的值
    int b = 0; //记录两相同元素之差与k作比较
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int[] num1 = new int[nums.length];
        for (int x =0;x<nums.length;x++){
            num1[x] = nums[x];
        }
        boolean flag = containsDuplicate1(num1); //先检查是否有重复元素
        if (flag==true){
            flag=false;
            for (Integer o : hashSet){
                for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == o){
                            list.add(i);
                            list1.add(nums[i]);
                        }
                }
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list1.get(j).equals(list1.get(j+1))) {  //这里用==的话，数字过大会出现问题，比如2147483647,-2147483648,2147483647,-2147483648
                        b = Math.abs(list.get(j) - list.get(j + 1));
                        if (b <= k)
                            flag = true;
                    }
                }
            }
        }
            return flag;
    }


    //找出是否包含重复元素，并将重复元素的值复制给Hashset
    public boolean containsDuplicate1(int[] nums) {
        boolean flag1 = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                hashSet.add(nums[i]);
                flag1=true;
            }
        }
        return flag1;
    }



    //方法二
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) return false;
        if(n <= 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.get(nums[i]) != null && (i - map.get(nums[i])) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
