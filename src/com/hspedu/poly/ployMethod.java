package com.hspedu.poly;

public class ployMethod {
    public static void main(String[] args) {
        A a = new A();


    }
}

class B{
    public void say(){
        System.out.println("B say()被调用");
    }
}


//方法重载是多态，都是调sum方法，但是效果状态不一样
class A extends B{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }


//    方法的重写也是多态，目前个人对方法的多态理解是方法名一样，干的事却不一样
    public void say(){
        System.out.println("A say()");
    }
}