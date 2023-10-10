package com.itheima.pojo.labproject.menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author B11000
 * @version Beta-0.0.1
 * @date 2023-08-04 14:35:09
 */
public class stuSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stuSys stusys = new stuSys();

        ArrayList<stuinfo> list = new ArrayList<>();
        //String[] stuinfo = new String[];
        boolean pd = true;
        while (pd) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 推出");
            System.out.println("请输入你的选择");
            switch (sc.nextInt()) {
                case 1:

                    stuadd(list);
                    break;
                case 2:
                    studel(list);
                    break;
                case 3:
                    System.out.println(stuindenx( list,sc.next()));
                    break;
                case 4:
                   stuck(list);
                    break;
                case 5:
                    pd = false;
                    break;
                default:
                    break;

            }

        }

    }

    public static void stuadd(ArrayList<stuinfo> list) {
        Scanner sc = new Scanner(System.in);

        String sid, name, birthday;
        int age;

        System.out.println("--学号--");
        sid = sc.nextLine();
        System.out.println("--姓名--");
        name = sc.nextLine();
        System.out.println("--年龄--");
        age = sc.nextInt();
        System.out.println("--生日--");
        birthday = sc.next();

        System.out.println("----");
        stuinfo stu = new stuinfo(sid, name, age, birthday);
        list.add(stu);
        
        System.out.println("学号 ， 姓名 ， 年龄 ， 生日");
        System.out.println(stu.getSid() + '\t' + stu.getName() + '\t' + stu.getAge() + '\t' + stu.getBirthday());
        System.out.println("输入成功");
        return;
    }
    public static int stuindenx(ArrayList<stuinfo> list,String mbsid) {
        int index = -1;
        for (int i = 0; i <list.size() ; i++) {
            stuinfo stu = list.get(i);
            String sid = stu.getSid();
            if (sid.equals(mbsid)){
                index =  i;

            }
        }

        return index;



    }
    public static void studel(ArrayList<stuinfo> list) {
        System.out.println("输入要删除的学号");
        Scanner sc = new Scanner(System.in);
        String mbid = sc.next();
        int wz = stuSys.stuindenx(list, mbid);
        list.remove(wz);

    }



    public static void stuck(ArrayList<stuinfo>list){
        if (list.size()==0){
            System.out.println("无信息, 请添加后重新查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i <list.size() ; i++) {
            stuinfo stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }


}
