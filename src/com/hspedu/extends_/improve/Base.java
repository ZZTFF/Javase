package com.hspedu.extends_.improve;

public class Base {
    public Base(){
        System.out.println("Base()无参构造器被调用");
    }
    public Base(String name, int age){
        System.out.println("Base(String name, int age)构造器被调用");
    }
    public Base(String name){
        System.out.println("Base(String name)构造器被调用");
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
}
