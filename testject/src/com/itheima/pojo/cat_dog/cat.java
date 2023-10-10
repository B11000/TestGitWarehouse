package com.itheima.pojo.cat_dog;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 19:14:46
 */
public class cat {
    private String color;
    private String breed;

    public cat() {
        this.color = color;
        this.breed = breed;
    }
    public cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat(){
        System.out.println(color+"的"+breed+"正在吃鱼");
    }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"正在逮老鼠");
    }
}
