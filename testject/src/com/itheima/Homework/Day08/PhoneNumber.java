package com.itheima.Homework.Day08;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 19:06:32
 *
 * 需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
 *         最终效果为：156****1234
 */
public class PhoneNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        String str1 = sc.nextLine();
        System.out.println("---------------");

        int len = str1.length();
        int lenend3 = len - 4;


        System.out.println(str1.substring(0, 3)+"****"+str1.substring(lenend3));

    }
}
