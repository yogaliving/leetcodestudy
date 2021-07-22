package practice.Backtracking;

import java.util.Scanner;

public class huawei_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//电话预约的个数
        int m = sc.nextInt();//桌子的数量
        int[][] arr = new int[n][3]; //储存时间点以及预约的人数
        for (int i = 0; i < n; i++) {
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
            arr[i][2]= sc.nextInt();
        }
        int[] result = new int[24];//用于储存每个时间点的客人数量
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < arr[i][1] - arr[i][0]; j++) {
                if (flag==false){
                    flag=true;
                    for (int k = 0; k < arr[i][1] - arr[i][0]; k++) {
                        if ((result[arr[i][0]+k] + arr[i][2])>m) {
                            flag=false;
                            break;
                        }
                    }
                }
                if (!flag) break;
                result[arr[i][0]+j] += arr[i][2];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
