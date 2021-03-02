package practice.array;

public class twoSum1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] a1 = new int[2];
        for (int i=0 ; i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if((numbers[i]+numbers[j])==target){
                    a1[0] = i+1;
                    a1[1] = j+1;
                    break;
                }
            }
        }

        return a1;
    }
    public int[] twoSum2(int[] numbers, int target) {
        int[] a1 = new int[2];
        int i =0;int l=numbers.length-1;
        while (i<l){
            if((numbers[i]+numbers[l])==target){
                a1[0] = i+1;
                a1[1] = l+1;
                break;
            }
            if ((numbers[i]+numbers[l])>target)
                l--;
            else
                i++;
        }

        return a1;
    }
}
