package com.itheima.pojo.salary;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-01 19:06:18
 */
public class Coder {
    private String name ;
    private String id ;
    private int salary;

    public Coder(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Coder() {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void coder(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员正在努力的写着代码");
    }
}
