package com.itheima.pojo.phone;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 18:44:07
 *
 *      品牌brand
 * 		价格price
 *
 * 	    打电话call()
 * 		发短信sendMessage()
 * 		玩游戏playGame()
 */
public class phone {

    private String brand;
    private int price;

    public phone() {
        this.brand = brand;
        this.price = price;
    }

    public phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(){
        System.out.println("正在使用价格为"+ this.price+"元的"+brand +"品牌的手机打电话");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+ price+"元的"+brand +"品牌的手机发短信");
    }
    public void playGame(){
        System.out.println("正在使用价格为"+ price+"元的"+brand +"品牌的手机玩游戏");
    }

}
