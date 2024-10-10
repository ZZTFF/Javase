package com.hspedu.extends_.improve;

public class Graduate extends Student {
    public void testing() {
        System.out.println("大学生" + name + "正在考大学数学...");
    }
    //子类继承所有属性和方法，私有属性和方法不能在子类直接访问，要通过父类提供公共方法访问
    public void say(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);无法访问
        f1();
        f2();
        f3();
//        f4();无法访问
        f5();
        callf4();
    }


}