package com.hspedu.Object;

public class Finalize {
    public static void main(String[] args) {
        Car car = new Car("white");
        car = null;
        System.gc();
        System.out.println("程序退出了");;
    }
}

class Car{
    private String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("销毁了一个对象");
    }
}