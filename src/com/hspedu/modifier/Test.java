package com.hspedu.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
//        private修饰符限制的是对类成员的直接访问
//        同胞不同类无法访问private
        System.out.println("直接调用A中属性");
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
//    对于类中调用方法来访问，这是在类内部进行的，可以访问类中所有属性

//无法调用a.m4()，因为同包不同类，无法访问private
        a.m1();
        a.m2();
        a.m3();
        //a.m4()





    }
}
