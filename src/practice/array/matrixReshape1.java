package practice.array;

/**
 * 566
 */
public class matrixReshape1 {
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        System.out.println(matrixReshape(a, 1, 4));
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[] nums1 = new int[nums.length*nums[0].length];
        if (r*c>nums.length*nums[0].length) return nums;
        int[][] nums2 = new int[r][c];
        int a = 0;
        for (int i =0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums1[a++] = nums[i][j];
            }
        }
        a=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                nums2[i][j] = nums1[a++];
            }
        }
        return nums2;
    }
}
