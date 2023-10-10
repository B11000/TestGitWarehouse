package com.itheima.Homework.Day09;

import java.util.Random;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:22:04
 */
public class dafeng {
    public static void main(String[] args) {
        Random ran = new Random();

        int max=0,min=100;
        int temp = 0;
        int []arr = new int[6];
        for (int i = 0; i < 6; i++) {
            int rannum = ran.nextInt(101);
            arr[i]=rannum;
            temp = temp +arr[i];
            System.out.print(arr[i]+",");
            if (arr[i]>max){
                max = arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println((temp-max-min)/4);



    }
}
