package practice.stack_queue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class huawei_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//模块总数
        int n = sc.nextInt();//一共N行
        int[][] arr =new int[n][2];//存储所有模块的行为
        for (int i = 0; i < n; i++) {
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
        }
        boolean circle=false;//记录无用模块个数
        Stack<Integer> stack = new Stack<>();
        int noUse= 0;//记录循环依赖个数
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i][0]);
            stack.add(arr[i][1]);
            for (int j = 0; j < arr.length; j++) {
                if (stack.get(0)==stack.get(1)){
                    circle=true;
                    break;
                }
                if (stack.peek()==arr[j][0]){
                    stack.pop();
                    stack.push(arr[j][1]);
                }
            }
            stack.clear();
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i][0]);
            hashSet.add(arr[i][1]);
        }
        int len = hashSet.size();
        noUse = m-len;
        System.out.println(10-(circle==true ? 2 : 0)-noUse);
    }
}
