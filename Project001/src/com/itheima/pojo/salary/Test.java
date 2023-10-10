package com.itheima.pojo.salary;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 19:01:13
 */
public class Test {
    public static void main(String[] args) {
        Manager mang = new Manager();
        mang.setId("123");
        mang.setSalary(15000);
        mang.setBonus(6000);
        mang.manager();

        Coder coder = new Coder();
        coder.setId("135");
        coder.setSalary(10000);

        coder.coder();
    }
}
