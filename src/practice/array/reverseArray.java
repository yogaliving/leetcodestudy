package practice.array;

//leetcode 189

public class reverseArray {

    public void rotate0(int[] nums, int k) {
        int l = nums.length;
        int[] a = new int[l];
        for (int i =0; i < l; i++ ){
            a[(i+k)%l] = nums[i];
        }
        for (int i =0; i < l; i++ ){
            nums[i] = a[i];
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public void rotate1(int[] nums, int k) {
        int l =nums.length;
        int a = k%l;
        reverse(nums,0,l-1);
        reverse(nums,0,a-1);
        reverse(nums,a,l-1);
    }
}
