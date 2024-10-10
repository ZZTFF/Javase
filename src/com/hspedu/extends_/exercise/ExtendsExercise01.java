package com.hspedu.extends_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B(7);


    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    int age;
    B(int age){
        this("abc");//super语句可以隐藏，
        // 但是语句执行时是逐句执行，在这里由于使用this调用构造器和super必须都得在第一句，
//        因此这里无法调用super()
        System.out.println("b");
    }
    B(String name){
//        这里隐藏了super()
        System.out.println("b name");
    }
}