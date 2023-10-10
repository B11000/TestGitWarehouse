package com.itheima.Homework.Day09;

import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 19:35:53
 */
public class StringDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        int x = 0;
        int n = 0;
        int q = 0;
        boolean boo = true;
        while (boo == true){
            String num1 = sc.next() ;
        char []chars1 = num1.toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i]>='A'&&chars1[i]<='Z'){
                    boo = false;
                    d++;
                }else if (chars1[i]>='a'&&chars1[i]<='z'){
                    x++;
                }else if (chars1[i]>='0'&&chars1[i]<='9'){
                    n++;
                }else {
                    q++;
                }

            }
            if (boo == true){
                System.out.println("必须包含大写字母");
            }
        }
        System.out.println("大写字母有："+d);
        System.out.println("小写字母有"+x);
        System.out.println("数字有"+n);
        System.out.println("其他字符有："+q);

    }
}
