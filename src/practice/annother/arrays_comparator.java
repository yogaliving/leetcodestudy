package practice.annother;

import java.util.Arrays;

public class arrays_comparator {
    public static void main(String[] args) {
        int[][] nums = {{5, 0}, {4, 1}, {6, 2}};
        //重写Comparator接口里面的compare方法，用Lambda表达式写比较简洁

        // 按行从小到大
        Arrays.sort(nums, (o1, o2) -> o1[0] - o2[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("值：" + nums[i][0] + "   序号：" + nums[i][1]);
        }

        // 按行从大到小
        Arrays.sort(nums, (o1, o2) -> o2[0] - o1[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("值：" + nums[i][0] + "   序号：" + nums[i][1]);
        }

        //按列从小到大
        Arrays.sort(nums, (o1, o2) -> o1[1] - o2[1]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("值：" + nums[i][0] + "   序号：" + nums[i][1]);
        }

        //按列从大到小
        Arrays.sort(nums, (o1, o2) -> o2[1] - o1[1]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("值：" + nums[i][0] + "   序号：" + nums[i][1]);
        }
    }

}
