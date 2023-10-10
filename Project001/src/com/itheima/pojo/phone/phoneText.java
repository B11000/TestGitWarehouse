package com.itheima.pojo.phone;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 18:52:55
 */
public class phoneText {
    public static void main(String[] args) {
        int price = 998;
        String brand = "小米";

        phone phone1 = new phone();
       phone1.setPrice(price);
        phone1.setBrand(brand);
        phone1.call();
        phone1.sendMessage();
        phone1.playGame();

        System.out.println("-----------");
        phone p2 = new  phone("huaw",1000);
        p2.call();
        p2.sendMessage();
        p2.playGame();
    }


}
