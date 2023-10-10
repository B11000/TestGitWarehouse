package com.itheima.Homework.Day08;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 20:33:22
 */
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        String num1 = sc.nextLine();
        System.out.println("---------------");
        char[] chars = num1.toCharArray() ;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]>='0'&&chars[i]<='9'){
                System.out.println(chars[i]);
            }
        }


        if (num1.length()!=11){
            System.out.println("注册用户失败");
        }else {
            System.out.println(num1.substring(num1.length()-4));
        }

    }
}
