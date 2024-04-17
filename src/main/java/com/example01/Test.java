package com.example01;

public class Test {
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.setName("syl");
        stu1.setSex(Student.Sex.FEMALE);
        stu2.setName("aaa");
        stu2.setSex(Student.Sex.MALE);
        System.out.println(stu1.getName() + " " + stu1.getSex());
        System.out.println(stu2.getName() + " " + stu2.getSex());

    }
}
