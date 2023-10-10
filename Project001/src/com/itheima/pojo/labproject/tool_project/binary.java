package com.itheima.pojo.labproject.tool_project;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 20:26:53
 */
public class binary {
     int num1;

    public void main1(){
        System.out.println("---输入数字选择进制,输入0停止--------");
        System.out.println("1,十转二     2,十转八     3,十转十六");
        System.out.println("4,二转十     5,二转八     6,二转十六");
        System.out.println("7,八转十     8,八转二     9,八转十六");
        System.out.println("10,十六转十 11,十六转八   12,十六转二");

        while (true){
            Scanner sc = new Scanner(System.in);
            switch (num1= sc.nextInt()) {
                case 1:
                    System.out.println("输入要转换的十进制数");
                    num1 = sc.nextInt();
                    System.out.println("----------------");
                    Shi_Z_Er(num1);//输入十进制打印二进制


                    continue;
                default:
                    break;
            }

        }

    }
    public void Shi_Z_Er(int num1){
        int wei = 0;
        for (int i = 0;num1> Math.pow(2, i); i++) {
            wei = wei+1;
        }
        int []arr1 = new int[wei];

        for (int i = (wei-1); i >=0 ; i--) {
            arr1[i]=num1%2;
            num1=num1/2;
        }
        System.out.println("B");


    }


}
