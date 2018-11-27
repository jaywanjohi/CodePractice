package ArraysAndStrings;

import java.util.ArrayList;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int [] A  = new int[]{1,1,2,2,3,3,3,10,5,5,3};
        ArrayList <Integer> B = new ArrayList<Integer>();

        java.util.Arrays.sort(A);
        int x = A[0];
        B.add(x);
        for (int i = 1; i < A.length; i++) {
            if (A[i] > x) {
                x = A[i];
                B.add(x);
            }
        }
        System.out.println("Array: " + B);
    }
}
