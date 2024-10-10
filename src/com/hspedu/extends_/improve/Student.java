package com.hspedu.extends_.improve;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("学生 " + name + " 年龄 " + age + " 成绩 " + score);
    }

//    下面定义一些不同修饰符定义的变量和方法
    public int a = 100;
    protected int b = 200;
    int c = 300;
    private int d = 400;

    public void f1(){}
    protected void f2(){}
    void f3(){}
    private void f4(){}
//父类提供public方法访问类中私有属性
    public int f5(){
        return d;
    }
//父类提供public方法访问类中私有方法，
// 细节1. 子类无法直接访问父类私有属性和方法。只能通过调用父类提供的public方法相当于进入到父类中，
// 从而可以访问父类中所有属性和方法
public void callf4(){
    f4();
}
}
