package practice.array;

public class sortArrayByParityII1 {
    public int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int countO =0;
        int countJ =1;
        int[] B = new int[len];
        for (int i=0;i<len;i++){
            if(A[i]%2==0){
                B[countO] = A[i];
                countO+=2;
            }
            else {
                B[countJ] = A[i];
                countJ+=2;
            }
        }
        return B;
    }
}
