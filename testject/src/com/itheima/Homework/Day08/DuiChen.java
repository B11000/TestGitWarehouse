package com.itheima.Homework.Day08;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 20:38:29
 */
public class DuiChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        String str1 = sc.nextLine();
        System.out.println("---------------");

        StringBuilder sb= new StringBuilder();
        int num1 = str1.length()/2;
        if(str1.length()%2==1){
            sb =  new StringBuilder(str1.substring(num1+1));
            //sb.reverse().toString();

            if ( sb.reverse().toString().equals(str1.substring(0, num1)) == true){
                System.out.println("为对称字符串");
            }else {
                System.out.println("b为对称字符串");
            }

        }else
            if(str1.length()%2==0){
                sb =  new StringBuilder(str1.substring(num1));
                //sb.reverse().toString();

                if ( sb.reverse().toString().equals(str1.substring(0, num1)) == true){
                    System.out.println("为对称字符串");
                }else {
                    System.out.println("不为对称字符串");
                }

            }else{
            System.out.println("不为对称字符串");
        }



    }
}
