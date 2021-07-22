package practice.week_competition;

public class connect_num {
    public static void main(String[] args) {

    }
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int j = len;
        int[] nums1 = new int[len*2];
        for (int i = 0; i < len; i++) {
            nums1[i] = nums[i];
            nums1[i+len] = nums[i];
        }
        return nums1;
    }
}
