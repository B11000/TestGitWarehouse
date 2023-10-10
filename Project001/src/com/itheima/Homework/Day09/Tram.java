package com.itheima.Homework.Day09;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 18:28:48
 */
public class Tram {
    private String brand;
    private int price;
    private int juli;

    public Tram() {
    }

    public Tram(String brand, int price, int juli) {
        this.brand = brand;
        this.price = price;
        this.juli = juli;
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

    public int getJuli() {
        return juli;
    }

    public void setJuli(int juli) {
        this.juli = juli;
    }
}
