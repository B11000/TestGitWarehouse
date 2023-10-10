package com.itheima.pojo.labproject.menu;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 15:29:43
 */
public class stuinfo {
    private String sid; // 学号
    private String name; // 姓名
    private int age; // 年龄
    private String birthday; // 生日

    public stuinfo() {
    }

    public stuinfo(String sid, String name, int age, String birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
