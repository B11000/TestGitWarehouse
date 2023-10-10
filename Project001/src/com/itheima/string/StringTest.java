package com.itheima.string;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 10:06:59
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = ("abc");
        String str8 = ("abcanddefano");
        String []str3 = str8.split("and");
        char []arr1 = {'a','b','c'};
       // String str3 = arr1;


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(arr1[2]);
        System.out.println(str1);
        System.out.println(str3[0] +""+str3[1]);
    }
}
