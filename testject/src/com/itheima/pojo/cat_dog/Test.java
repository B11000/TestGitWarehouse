package com.itheima.pojo.cat_dog;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 19:19:21
 */
public class Test {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.setColor("花色");
        cat.setBreed("波斯猫");
        cat.eat();
        cat.catchMouse();

        dog dog = new dog();
        dog.setBreed("黑色");
        dog.setColor("藏獒");
        dog.eat();
        dog.lookHome();
        }
    }

