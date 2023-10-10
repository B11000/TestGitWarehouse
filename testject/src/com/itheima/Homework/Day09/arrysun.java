package com.itheima.Homework.Day09;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:17:19
 */
public class arrysun {
    public static void main(String[] args) {
        int []arr = {68,27,95,88,171,996,51,210};
        int len = arr.length;
        int temp =0;

        for (int i = 0; i < len; i++) {
            if (arr[i]%2==0 && arr[i]%10!=7 && arr[i]/10!=7){
                temp = temp + arr[i];
            }
        }
        System.out.println(temp);

    }
        }
