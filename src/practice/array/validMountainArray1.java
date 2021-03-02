package practice.array;

/**
 * 941
 */
public class validMountainArray1 {
    public static void main(String[] args) {
        int[] a = {0,1,2,1,2};
        validMountainArray(a);
    }
    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        int sign=findSign(arr);
        boolean flag = true;
        if((len<3)||sign==0) return false;
        for (int i =sign;i<len-1;i++){
            if(arr[i+1]>=arr[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int findSign(int[] a){
        int sign = 0;
        for (int i=0;i<a.length-1;i++){
            if(a[i+1]<=a[i]) {
                sign = i;
                break;
            }
        }
        return sign;
    }
    public boolean validMountainArray2(int[] A) {
        int N = A.length;
        int i = 0;

        // 递增扫描
        while (i + 1 < N && A[i] < A[i + 1]) {
            i++;
        }

        // 最高点不能是数组的第一个位置或最后一个位置
        if (i == 0 || i == N - 1) {
            return false;
        }

        // 递减扫描
        while (i + 1 < N && A[i] > A[i + 1]) {
            i++;
        }

        return i == N - 1;

    }
}
