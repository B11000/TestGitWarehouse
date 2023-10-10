package com.itheima.Homework.Day09;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:52:23
 */
public class arrscan {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        boolean boo = false;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num1 == arr[i]){
                System.out.println(i+1);
                boo = true;
            }
        }
        if (boo == false){
            System.out.println("-1");
        }
    }
}
