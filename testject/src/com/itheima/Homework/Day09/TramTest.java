package com.itheima.Homework.Day09;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 18:39:26
 */
public class TramTest {
    public static void main(String[] args) {
        ArrayList<Tram> list = new ArrayList<>();

        String brand = "自定义品牌";
        int prince = 114514;
        Random random = new Random();

        for (int i = 0; i <3 ; i++) {
            int ran = random.nextInt(2001);
            Tram tra = new Tram(brand,prince,ran);
            list.add(tra);
        }

boolean boo = false;
        for (int i = 0; i < list.size(); i++) {
            Tram tramkm = list.get(i);
            int km = tramkm.getJuli();
            if (km<1000){
                boo= true;

                System.out.println("品牌："+tramkm.getBrand()+"，价格："+tramkm.getPrice()+"，行驶距离"+tramkm.getJuli());
            }

        }
        if (boo == false){
            System.out.println("不存在已行驶距离在1000以下的电车");
        }else {
            System.out.println("存在已行驶距离在1000以下的电车");
        }


    }
}
