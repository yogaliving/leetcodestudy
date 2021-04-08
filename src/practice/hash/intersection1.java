package practice.hash;
/**
 * 找到两个数组中的交集
 * 1 用set或者list集合找交集
 * 2 先对两个数组排序，用双指针找到交集
 */

import java.util.*;

public class intersection1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]) hashSet.add(nums1[i]);
            }
        }
        int[] arr = new int[hashSet.size()];
        int a = 0;
        for(Integer it : hashSet){
            arr[a] = it;
            a++;
        }
        return arr;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i]) && !list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        //return list2.toArray(new int[list2.size()]); 这里的类型不对，int数组和list不能这样转换
        return list2.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        int[] res = new int[set.size()];
        int index = 0;
        for (int num : set) {
            res[index++] = num;
        }
        return res;
    }

}
