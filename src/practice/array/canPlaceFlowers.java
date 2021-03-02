package practice.array;

/**
 * 605   贪心算法
 */
public class canPlaceFlowers {
    public static void main(String[] args) {
        int[] a = {0,1,0};
        System.out.println(canPlaceFlowers1(a, 1));
    }
    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if (count>=n) return true;
            i++;
        }
        return count >= n;
    }
}
