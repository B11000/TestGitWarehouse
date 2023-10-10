package com.itheima.Homework.Day08;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 19:22:42
 *
 * 键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
 */
public class HeXie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        String str1 = sc.nextLine();
        System.out.println("---------------");

        System.out.println(str1.replace("TMD", "***"));
    }
}
