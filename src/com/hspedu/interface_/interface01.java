package com.hspedu.interface_;

public class interface01 {
    public static void main(String[] args) {

    }
}


//类A实现接口类，需要实现接口类所有抽象方法
class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}
