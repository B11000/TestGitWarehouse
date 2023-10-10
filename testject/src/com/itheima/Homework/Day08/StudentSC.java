package com.itheima.Homework.Day08;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 19:34:19
 */
public class StudentSC {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("---------------");
       String str1 = sc.nextLine();
       System.out.println("---------------");
       String[] strs = str1.split(",");

       int num2 = Integer.valueOf(strs[1]);
        System.out.println(strs[0]+num2);






    }
}
