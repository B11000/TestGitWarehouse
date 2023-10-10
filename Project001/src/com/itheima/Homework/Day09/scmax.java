package com.itheima.Homework.Day09;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:48:12
 */
public class scmax {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int []arr = new int[3];
        int max=0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            System.out.println("----");
            if (max<arr[i]){
                max= arr[i];
            }
        }
        System.out.println(max);

    }
}
