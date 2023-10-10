package com.itheima.Homework.Day09;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:10:38
 */
public class jiaohuan {
    public static void main(String[] args) {
        int []arr = {19, 28, 37, 46, 50};
        int leng = arr.length;
        int []arr2 = new int[leng];
        for (int i = 0; i < leng; i++) {
            int j = leng-1;
            arr2[j] = arr[i];

            System.out.print(arr2[j]+" ");
            j--;
        }

    }
}
