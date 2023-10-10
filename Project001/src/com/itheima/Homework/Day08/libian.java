package com.itheima.Homework.Day08;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-03 19:49:02
 *
 * 有如下字符串:"12ab,java,cd,Server78"
 * 遍历这些字符串，如果字符串没有包含数字的，就将字符串中的小写字母转成大写字母并打印字符串
 */
public class libian {
    public static void main(String[] args) {
        boolean boo = false;
        String str1 = "12ab,java,cd,Server78";



        String[]strs = str1.split(",");

        for (int i = 0; i < strs.length; i++) {
            char []chars = strs[i].toCharArray();
            char []char2 = strs[i].toCharArray();

            for (int j = 0; j < strs[i].length(); j++) {

            if (chars[j]>='0' && chars[j]<='9'){
                boo = false;
                break;


            }


             boo = true;
            }
            if (boo == true){
                System.out.println(strs[i].toUpperCase());
            }else{
                System.out.println(strs[i]);
            }

        }
    }
}
