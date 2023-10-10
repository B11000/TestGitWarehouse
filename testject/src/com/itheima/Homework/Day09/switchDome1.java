package com.itheima.Homework.Day09;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:04:41
 */
public class switchDome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        switch ( num = sc.nextInt()){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入无效");
                break;

        }
    }
}
