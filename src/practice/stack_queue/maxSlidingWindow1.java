package practice.stack_queue;
/**
 * 239
 *
 */

import java.util.LinkedList;

public class maxSlidingWindow1 {

    //用队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len<2) return nums;
        LinkedList<Integer> queue = new LinkedList();
        // 结果数组
        int[] result = new int[len-k+1];
        for (int i = 0; i < len; i++) {
            //队首放最大值的下标，如果加进来的数比队尾下标对应的数组大就循环移除队尾元素，知道队列为空
            while (!queue.isEmpty()&&nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            //此时队列要么为空，要么队首下标的元素比此时添加元素的下标大
            queue.addLast(i);

            //如果队首的下标是最新的则队列元素只有一个
            //所以队首下标一般是最早添加的，如果队列的元素达到大于3了，就移除队首元素
            if(queue.peek() <= i-k){
                queue.poll();
            }
            //当达到数组的第k个元素后才开始像结果数组添加元素
            if (i>=k-1)
                result[i-k+1] =nums[queue.peek()];
        }
        return result;
    }


    //暴力破解法超时！
    public int[] maxSlidingWindow2(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len-k+1];
        int j = 0;
        for (int i = 0; i < len-k+1; i++) {
            arr[i] = max_value(nums,i,i+k-1);
        }
        return arr;
    }
    static int max_value(int[] arr,int l,int r){
        int max = -10000;
        for (int i = l; i <= r ; i++) {
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
