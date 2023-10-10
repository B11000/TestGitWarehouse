package com.itheima.pojo.labproject;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 20:59:56
 *
 * 正在进行十转二算数编写
 */
public class test {
    public static void main(String[] args) {
        int num1= 42;
        /*
        先对十进制数进行计算介于2的哪两个次方之间，那么它的二进制数就有大次方的位数
         */
        int wei = 0;
        for (int i = 0;num1> Math.pow(2, i); i++) {
            wei = wei+1;
        }
       // int []arr1 = new int[wei];

        for (int i = (wei-1); i >=0 ; i--) {
            System.out.print(num1%2);
            num1=num1/2;
        }
    }
}
