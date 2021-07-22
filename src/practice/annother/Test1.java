package practice.annother;

import java.util.*;

/**
 * @author leo
 * @description:
 * @create 2021-05-08 19:29
 */
public class Test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String S = scanner.next();
//        long len = scanner.nextLong();
        String S = "a";
        long len = 1000000000l;
        long length = S.length();

        HashMap<Character, Long> map = new HashMap<>();

        for (long i = 0; i < len; i++){
            char c = S.charAt((int) (i % length));
            if (map.containsKey(c)){
                long fre = map.get(c);
                map.replace(c, fre+1);
            }else {
                map.put(c, (long) 1);
            }
        }

        Set<Map.Entry<Character, Long>> entries = map.entrySet();
        long Max = 0;
        long Min = len;
        for (Character entry: map.keySet()){
            Max = Math.max(map.get(entry), Max);
            Min = Math.min(map.get(entry), Min);
        }

        long num = Max -Min;

        boolean prime = isPrime(num);
        if (prime){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(num);
    }


    private static boolean isPrime(long n){
        if (n < 2) return false;
        for (int i = 2; i < n ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


}
